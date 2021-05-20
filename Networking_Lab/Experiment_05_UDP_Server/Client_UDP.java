/*
    Experiment 05
    Creation of UDP Server
        - Client Side Program

    How to Execute:
    1. In the LHS:
        javac Server_UDP.java
    2. In the RHS:
        javac Client_UDP.java
    3. In the LHS:
        java Server_UDP
    4. In the RHS:
        java Client_UDP

    Start typing out only in the Server side.
    You can see that the same thing will be printed in the Client side.
    To stop execution, type `end` in the server side.
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
