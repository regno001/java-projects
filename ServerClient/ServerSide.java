package ServerClient;

import java.io.*;
import java.net.*;
public class ServerSide {
    public static void main(String[] args) throws Exception {

        ServerSocket ss= new ServerSocket(5000);
        System.out.println("Wating for the Client ");

        Socket s=ss.accept();
        System.out.println("Client connect successfully");

        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));

                PrintWriter out = new PrintWriter(s.getOutputStream(),true);
        out.println("Welcome Client ");
        System.out.println("Client says "+ in.readLine());
        s.close();
        ss.close();


    }

}
