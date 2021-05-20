/*
    Experiment 10
    Creation of FTP using UDP
        - Client Side Program

    How to Execute:
    1. In the LHS:
        javac ServerFTPUDP.java
    2. In the RHS:
        javac ClientFTPUDP.java
    3. In the LHS:
        java ServerFTPUDP
    4. In the RHS:
        java ClientFTPUDP

    Input to be given in the Server Side.
    Enter the file name to be opened. Ex. list.txt
    Contents of that file will be printed on the Client side.
*/

import java.net.*;
import java.io.*;

public class ClientFTPUDP {
    public static void main(String[] args) throws Exception {
        InetAddress sa = InetAddress.getLocalHost();
        byte data[] = new byte[1024];

        DatagramSocket ds = new DatagramSocket(8001);
        DatagramPacket dp = new DatagramPacket(data, data.length);

        ds.receive(dp);
        String msg = new String(dp.getData(), 0, 0, dp.getLength());
        System.out.println("Received Data :\n" + msg);
    }
}
