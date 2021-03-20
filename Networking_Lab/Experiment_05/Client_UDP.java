/*
    Experiment 05
    Creation of UDP Server
        - Client Side Program
*/

import java.net.*;
import java.io.*;

public class Client_UDP {
    public static int client = 1080;

    public static void main(String args[]) throws IOException {
        DatagramSocket ds = new DatagramSocket(client);
        byte b[] = new byte[1024];

        System.out.println("Client....Receiving....");

        while(true) {
            DatagramPacket dp = new DatagramPacket(b, b.length);
            ds.receive(dp);
            String s = new String(dp.getData(), 0, dp.getLength());
            if(s.equals("end")) 
                break;
            else 
                System.out.println(s);
        }
    }
}
