package UrlUsage;

import java.io.*;
import java.net.*;

public class UrlConnection {
    public static void main(String[] args) {
        try {
            URL a = new URL("https://www.google.com");
            URLConnection u = a.openConnection();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(u.getInputStream())
            );

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
