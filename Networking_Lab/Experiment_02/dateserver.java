/*
    Experiment 02
    Creation of Date Server
        - Server Side Program
*/

import java.io.*;
import java.net.*;
import java.util.*;

class dateserver {
    public static void main(String args[]) {

        ServerSocket ss;
        Socket s;
        PrintStream ps;
        DataInputStream dis;
        String inet;

        try {
            ss = new ServerSocket (8020);
            while(true) {
                s = ss.accept();
                ps = new PrintStream(s.getOutputStream());
                Date d = new Date();
                ps.println(d);
                ps.close();
            }
        }

        catch(IOException e) {
            System.out.println("The exception is: " + e);
        }

    }
}
