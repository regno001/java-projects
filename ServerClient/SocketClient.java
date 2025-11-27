package ServerClient;

import java.io.*;
import java.net.*;
public class SocketClient {
    public static void main(String[] args)throws Exception {
   Socket s=new Socket("localhost",5000);
   PrintWriter out = new PrintWriter(s.getOutputStream());
   BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));

   out.println("Hello Server");
        System.out.println("Server "+ in.readLine());
    }
}
