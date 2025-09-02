import java.util.Scanner;

public class CalculatorTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Calculator ");
        System.out.println("Enter the first number ");
        int a = input.nextInt();
        System.out.println("Enter the Second number");
        int b= input.nextInt();
        System.out.println("Enter the Operation to be Performed");
        System.out.println("+ = 1");
        System.out.println("- = 2");
        System.out.println("* = 3");
        System.out.println("/ = 4");
        int operations = input.nextInt();
        int result = switch(operations){
            case 1 -> a +b;
            case 2 -> a-b;
            case 3 -> a*b;
            case 4 -> a/b;
            default -> 404;
        };
        System.out.println("The result is" + result);
    }
}
