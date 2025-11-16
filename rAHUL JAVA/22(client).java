client
import java.io.*;
import java.net.*;
import java.util.*;
public class UppercaseClient {
    public static void main(String[] args) throws Exception {
        System.out.println("Name: rahul");
        System.out.println("Roll No: 47");
        System.out.println("Course: BCA G1");
        Socket s = new Socket("localhost", 5000);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        System.out.print("Enter a string: ");
        String msg = br.readLine();
        out.println(msg);
        System.out.println("From Server (Uppercase): " + in.readLine());
        s.close();
    }
}