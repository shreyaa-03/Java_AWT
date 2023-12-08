import java.net.*;
import java.io.*;
public class UrlDemo {
    public static void main(String[] args) {
        try{
        URL url = new URL("https://www.javapoiny.com/java-tutorial");
        System.out.println("Port Number: " + url.getPort());
        System.out.println("Default Port Number: " + url.getDefaultPort());
        System.out.println("Host Name: " + url.getHost());
        System.out.println("Protocol: " + url.getProtocol());

    
    }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
