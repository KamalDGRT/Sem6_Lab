/*
    Experiment 07
    Creation of TELNET Protocol
        - Client Side Program

    How to Execute:
    1. In the LHS:
        javac ServerTelnet.java
    2. In the RHS:
        javac ClientTelnet.java
    3. In the LHS:
        java ServerTelnet
    4. In the RHS:
        java ClientTelnet

    Input to be given in the Client Side.
    Output will be printed on the Server Side.
*/

import java.net.*;
import java.io.*;

class ClientTelnet {
    public static void main(String args[]) throws Exception {
        Socket soc = new Socket("localhost", 8088);
        String Command;

        DataInputStream din = new DataInputStream(soc.getInputStream());
        DataOutputStream dout = new DataOutputStream(soc.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to Telnet Client");
        System.out.println("< Telnet Prompt >");
        Command = br.readLine();
        dout.writeUTF(Command);
        System.out.println(din.readLine());

        soc.close();
        din.close();
        dout.close();
        br.close();
    }

}
