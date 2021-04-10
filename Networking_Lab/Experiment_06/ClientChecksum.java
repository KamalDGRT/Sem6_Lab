/*
    Experiment 06
    Calculation of Checksum for packet and data and file
        - Client Side Program
    # Client passes the command line arguments
    # javac ClientChecksum.java
    # java ClientChecksum Arg1 Arg2
*/

import java.net.*;
import java.io.*;
import java.lang.*;
import java.util.zip.*;

public class ClientChecksum {
    public static void main(String[] args) throws Exception {
        try {
            Socket s = new Socket(InetAddress.getLocalHost(), 2160);
            BufferedReader br = new BufferedReader(
                                    new InputStreamReader(
                                        s.getInputStream()
                                    )
                                );
            PrintWriter out = new PrintWriter(
                                    s.getOutputStream(),
                                    true
                                );

            String data = "";
            CRC32 c = new CRC32();
            for(int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
                c.update(args[i].getBytes());
                data = data + args[i] + "";
            }

            System.out.println(data);
            System.out.println("CRC = " + c.getValue());
            out.println(data);
            out.println(c.getValue());
            System.out.println(br.readLine());
        }

        catch(Exception e){}
    }
}
