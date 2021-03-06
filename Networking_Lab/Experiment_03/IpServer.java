import java.net.*;
import java.io.*;
import java.util.*;

class IpServer {
    public static void main(String[] args) {
        ServerSocket ss;
        Socket s;
        DataInputStream dis;
        String inet;

        try {
            ss = new ServerSocket(8020);
            while(true) {
                s = ss.accept();
                dis = new DataInputStream(s.getInputStream());
                inet = dis.readLine();
                System.out.println("The Client System Address is : " + inet);
            }
        }

        catch (IOException e) {
            System.out.println("The exception is : " + e);
        }
    }
}
