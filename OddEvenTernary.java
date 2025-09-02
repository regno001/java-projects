import java.util.Scanner;

public class OddEvenTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcom to check the even odd ");
        System.out.println("enter the number ");
        int a = input.nextInt();
        String s = a % 2 == 0 ? "Even" : "odd";
        System.out.println(s + " is the nature of number " + a);
    }
}
