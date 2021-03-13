/*
    Experiment 04
    Creation of Chat Server
        - Client Side Program
*/

import java.net.*;
import java.io.*;

public class ChatClient {

    public static void main(String args[]) {

        try {
            Socket s = new Socket(InetAddress.getLocalHost(), 4000);
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(s.getOutputStream(), true);

            while(true) {
                System.out.print("Client : ");
                out.println("Client : " + in.readLine());
                System.out.println(br.readLine());
            }
        }

        catch (Exception e) {
            System.out.println("The connection to the server has been reset!");
        }
    }
}
