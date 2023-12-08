import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import javax.net.*;
public class Dsender {
    public static void main(String[] args)throws Exception {
        DatagramSocket ds = new DatagramSocket();
        String s = "Welcome!";
        InetAddress ip = InetAddress.getByName("127.0.0");
        DatagramPacket dp = new DatagramPacket(s.getBytes(),s.length(),ip,3000);
        ds.send(dp);
        ds.close();
    }
}
