/*
    Address on Sever
        - Client Side Program

    How to Execute:
    1. In the LHS:
        javac IpServer.java
    2. In the RHS:
        javac IpClient.java
    3. In the LHS:
        java IpServer
    4. In the RHS:
        java IpClient

    The output will be printed on the Server Side (LHS).
*/


import java.net.*;
import java.io.*;

class IpClient {
    public static void main(String[] args)  {
        Socket soc;
        PrintStream ps;
        
        try {
            InetAddress ia = InetAddress.getLocalHost();
            soc = new Socket(ia, 8020);
            ps = new PrintStream(soc.getOutputStream());
            ps.println(ia);
        }

        catch (IOException e) {
            System.out.println("The exception is : " + e);
        }
    }
}
