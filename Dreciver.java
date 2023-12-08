import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
public class Dreciver {
    public static void main(String[] args)throws Exception {
        DatagramSocket ds = new DatagramSocket(3000);
        byte[] buff = new byte[1000];
        DatagramPacket dp = new DatagramPacket(buff,1000);
        ds.receive(dp);
        String s = new String(dp.getData(),0,dp.getLength());
        System.out.println(s);
        ds.close();
    }
    
}
