/*
    Experiment 10
    Creation of FTP using UDP
        - Client Side Program
    Input to be given.
*/

import java.net.*;
import java.io.*;

public class ServerFTPUDP {
    public static void main(String[] args) throws Exception {
        InetAddress sa = InetAddress.getByName(null);
        BufferedReader in = new BufferedReader(
                                new InputStreamReader(
                                    System.in
                                )
                            );

        String msg = "", fn, tmp;
        System.out.println("Enter the File Name: ");
        fn = in.readLine();
        File f = new File(fn);
        System.out.println("\nSending the Data :");

        if(f.isFile() && f.canRead()) {
            BufferedReader fil = new BufferedReader(
                                    new FileReader(fn)
                                );
            while((tmp = fil.readLine()) != null)
                msg = msg + tmp + "\n";
        }
        else
            msg = "ERROR IN INPUT FILE!!";

        System.out.println(msg);
        byte data[] = new byte[msg.length()];
        msg.getBytes(0, msg.length(), data, 0);
        DatagramSocket ds = new DatagramSocket(8000);
        DatagramPacket dp = new DatagramPacket(
            data,
            data.length,
            sa,
            8001
        );
        ds.send(dp);
    }
}
