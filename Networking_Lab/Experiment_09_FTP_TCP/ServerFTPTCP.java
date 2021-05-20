/*
    Experiment 09
    Creation of FTP using TCP
        - Client Side Program
    Nothing to be done here.
    Input to be given in the Server Side.
*/

import java.net.*;
import java.io.*;

public class ServerFTPTCP extends Thread {
    public static void main(String args[]) {
        try {
            ServerSocket ss=new ServerSocket(4000);
            Socket s = ss.accept();

            BufferedReader br = new BufferedReader(
                                    new InputStreamReader(
                                        s.getInputStream()
                                    )
                                );
            BufferedReader in = new BufferedReader(
                                    new InputStreamReader(System.in)
                                );                                
            PrintWriter out = new PrintWriter(
                                s.getOutputStream(),
                                true
                            );
            String fn, contents = "", temp;

            System.out.println("Enter the file name to open: ");
            fn = in.readLine();
            File f = new File(fn);

            if(f.isFile() && f.canRead()) {
                BufferedReader fil = new BufferedReader(
                                        new FileReader(fn)
                                    );
                while((temp = fil.readLine()) != null)
                    contents = contents + temp + "\n";
            }
            else
                contents = "Error in input file!!";

            System.out.println("The contents of the file is:\n" + contents);
            System.out.println("Sending the file to the client....");
            out.println(contents);
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
