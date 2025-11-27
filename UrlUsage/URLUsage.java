package UrlUsage;

import java.net.*;
public class URLUsage {
    public static void main(String[] args) throws Exception {
        URL a= new URL("https://github.com/regno001/java-projects");
        System.out.println("Protocol" + a.getProtocol());
        System.out.println("Port" + a.getPort());
        System.out.println("File"+ a.getFile());
        System.out.println("Host"+ a.getHost());
    }
}
