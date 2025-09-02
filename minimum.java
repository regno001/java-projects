import java.util.Scanner;

public class minimum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Minimum finder ");
        System.out.println("enter the first number");
        int a = input.nextInt();
        System.out.println("enter the second number ");
        int b =input.nextInt();
        int minNum = a < b  ? a : b ;
        System.out.println(minNum + " is the minimum number amoung them");

    }
}
