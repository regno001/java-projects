import java.util.Scanner;

public class StringConcat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String ");
        String a=input.nextLine();
        String b= input.nextLine();
        System.out.println("Concatination");
        System.out.printf("%S ",a+ " "+ b);
    }
}
