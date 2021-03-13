/*
    Experiment 04
    Creation of Chat Server
        - Server Side Program
*/

import java.net.*;
import java.io.*;

public class ChatServer extends Thread {

    public static void main(String args[]) throws Exception {

        ServerSocket ss = new ServerSocket(4000);
        Socket s = ss.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        String str;

        try {

            while(true) {
                System.out.print("Server : ");
                str = in.readLine();
                out.println("Server : " + str);
                System.out.println(br.readLine());
            }
        }

        catch(IOException e) {
            System.out.println("The connection to the client has been reset!");
        }
    }
}
