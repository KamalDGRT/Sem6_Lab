/*
    Experiment 06
    Calculation of Checksum for packet and data and file
        - Server Side Program
*/

import java.net.*;
import java.io.*;
import java.util.*;
import java.util.zip.*;
import java.lang.*;

public class ServerChecksum extends Thread {
    public static void main(String[] args) throws Exception {
        try {
            ServerSocket sSocket = new ServerSocket(2160);
            Socket cSocket = sSocket.accept();

            BufferedReader br = new BufferedReader(
                                    new InputStreamReader(
                                        cSocket.getInputStream()
                                    )
                                );

            PrintWriter out = new PrintWriter(
                                    cSocket.getOutputStream(),
                                    true
                                );

            String str1, str2;
            str2 = br.readLine();
            System.out.println("INCOMING DATA : " + str2);
            StringTokenizer s = new StringTokenizer(str2, "");
            CRC32 c = new CRC32();
            str1 = s.nextToken();

            // +2 because we are checking with the empty string at the last
            for(int i = 0; i < s.countTokens() + 2; i++) {
                System.out.println("Str 1 : " + str1);
                System.out.println("Str 2 : " + str2);
            }

            c.update(str1.getBytes());

            long rCRC = Long.parseLong(br.readLine()),
                cCRC = c.getValue();

            System.out.println("rCRC = " + rCRC);
            System.out.println("cCRC = " + cCRC);

            if(rCRC == cCRC) {
                out.println("ClientSide: CRC Check Successful !!!"); 
                System.out.println("ServerSide: CRC Check successful..."); 
            } else {
                out.println("ClientSide: CRC Check un-successful !!!");
                System.out.println("ServerSide: CRC Check un-successful !!!");
            }
        }
        catch(Exception e){}
    }
}
