package in.regno.exception.File;

import java.io.FileWriter;
import java.io.IOException;

public class RegnoWriter {
    public static void main(String[] args) {


        String filename = "Rahul.txt";
        try (FileWriter writer = new FileWriter(filename)){
            writer.write("the is the best platform\n");
            for (int i=0;i<10;i++) {
                for (int j = i; j < 10; j++) {
                    writer.write("*");
                }
            }
            writer.flush();
            System.out.println("file written successfully");
        } catch (IOException exception) {
            System.out.println(exception.getMessage());

        }
    }
}
