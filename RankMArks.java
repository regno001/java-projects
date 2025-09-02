import java.sql.SQLOutput;
import java.util.Scanner;

public class RankMArks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Marks Of the student");
        int a = input.nextInt();
        String s= a>80 ? "High":
                  a>50 && a<80 ? "Moderate": "Low";
        System.out.println("studen belongs to " + s + " Category" );
    }
}
