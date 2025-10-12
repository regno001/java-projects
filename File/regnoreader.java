package in.regno.exception.File;

import java.io.FileReader;
import java.io.IOException;

public class regnoreader {
    public static void main(String[] args) {
        String filename = "rahul.txt";
        try (FileReader reader = new FileReader(filename)) {
            int read = 0;
            do {
                read =  reader.read();
                System.out.print((char)read);
            } while (read != -1);
        } catch (IOException e) {
            System.out.println("Exception occur "+ e.getMessage());
        }
    }
}