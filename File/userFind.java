package in.regno.exception.File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class userFind {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();


        try(FileReader r = new FileReader(s)) {
            int read;
            while ((read = r.read()) != -1) {
                System.out.print((char) read);
            }
            }catch (FileNotFoundException e){
            System.out.println("Please provide the file");
            System.out.printf("%s this file not found \n",s);
            System.out.println("File not found bro "+e.getMessage());
        }

        catch (IOException e){
            System.out.println("Exception " + e.getMessage());
            }
    }
}
