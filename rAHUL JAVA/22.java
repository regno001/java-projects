import java.io.*;
import java.net.*;
public class UppercaseServer {
    public static void main(String[] args) throws Exception {
        System.out.println("Name: rahul");
        System.out.println("Roll No: 47");
        System.out.println("Course: BCA G1");
        ServerSocket ss = new ServerSocket(5000);
        System.out.println("Server started. Waiting for client...");
        Socket s = ss.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        String str = in.readLine();
        System.out.println("Received from client: " + str);
        String upper = str.toUpperCase();
        out.println(upper);
        System.out.println("Sent to client: " + upper);
        s.close();
        ss.close();
    }
}



