/*
    Experiment 07
    Creation of TELNET Protocol
        - Server Side Program
*/

import java.lang.*;
import java.io.*;
import java.net.*;

class ServerTelnet {
    public static void main(String args[]) {
        String data = "Hello Client!! ";
        try {
            ServerSocket srvr = new ServerSocket(8088);
            Socket skt = srvr.accept();
            System.out.println("Client Connected!");
            PrintWriter out = new PrintWriter(skt.getOutputStream(), true);
            DataInputStream din=new DataInputStream(skt.getInputStream());
            String myStr = din.readUTF();
            // if(din.readUTF().equals("1")){
                System.out.println("String: '" + myStr);
                out.print(myStr);
            // }

            out.close();
            skt.close();
            srvr.close();
            din.close();
        }
        catch(Exception e) {
            System.out.print(e);
        }
    }
}
