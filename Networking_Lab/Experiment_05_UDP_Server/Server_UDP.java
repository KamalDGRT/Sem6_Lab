/*
    Experiment 05
    Creation of UDP Server
        - Server Side Program
*/

import java.net.*;
import java.io.*;

public class Server_UDP {
    public static int client = 1080;
    public static int server = 2160;

    public static void main(String arg[]) throws IOException {
        String s;
        InetAddress id = InetAddress.getLocalHost();
        BufferedReader dis = new BufferedReader(new InputStreamReader(System.in));
        DatagramSocket ds = new DatagramSocket(server);
        byte b[] = new byte[1024];

        System.out.println("Server Side.... Sending....");
        System.out.println("\n" + id);

        while(true) {
            s = dis.readLine();
            if(s.equals("end")) {
                b = s.getBytes();
                DatagramPacket dp = new DatagramPacket(b, s.length(), id, client);
                ds.send(dp);
                break;
            } else {
                b = s.getBytes();
                DatagramPacket dp = new DatagramPacket(b, s.length(), id, client);
                ds.send(dp);
            }
        }
    }
}
