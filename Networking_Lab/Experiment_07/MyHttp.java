/*
    Experiment 07
    Program to Implement HyperText Transfer Protocol
*/

import java.io.*;
import java.net.*;

public class MyHttp {
    public static void main(String args[]) throws IOException {
        URL url = new URL("http://www.google.com/");
        URLConnection conn = url.openConnection();
        conn.connect();

        InputStreamReader content = new InputStreamReader(conn.getInputStream());
        FileWriter f = new FileWriter("google.html");

        for(int i = 0; i != -1; i = content.read()) {
            f.write((char) i);
        }

    }
}
