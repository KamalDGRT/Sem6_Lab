/*
    Experiment 09
    Creation of FTP using TCP
        - Client Side Program

    How to Execute:
    1. In the LHS:
        javac ServerFTPTCP.java
    2. In the RHS:
        javac ClientFTPTCP.java
    3. In the LHS:
        java ServerFTPTCP
    4. In the RHS:
        java ClientFTPTCP

    Input to be given in the Server Side.
    Enter the file name to be opened. Ex. list.txt
    Contents of that file will be printed on the Client side.
*/

import java.net.*;
import java.io.*;

public class ClientFTPTCP {
    public static void main(String args[]) {
        try {
            Socket s = new Socket(InetAddress.getLocalHost(), 4000);
            BufferedReader br = new BufferedReader(
                                    new InputStreamReader(
                                        s.getInputStream()
                                    )
                                );
            String str;
            System.out.println("Receiving the file from server....");
            System.out.println("The Contents of the file is :\n");
            while((str = br.readLine()) != null)
                System.out.println(str);
        }

        catch(Exception e) {
            System.out.println("The connection to the server has been reset!");
        }
    }
}
