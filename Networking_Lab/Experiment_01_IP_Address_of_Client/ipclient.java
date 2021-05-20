/*
    Experiment 01
    Finding the IP Address of a machine/system
    How to execute:
    1. javac ipclient.java
    2. java ipclient
*/

import java.net.*; 
import java.io.*;

class ipclient {
    public static void main(String args[]) {

        try {
            InetAddress ia = InetAddress.getLocalHost(); 
            System.out.println("The client system address is: " + ia);
        }

        catch(IOException e) { 
            System.out.println("The exception is: " + e); 
        }

    }
}
