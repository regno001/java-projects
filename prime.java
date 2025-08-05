import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        greet();
        num();

    }

    public static void greet() {
        System.out.println("Welcome to PRime number Finder");
        System.out.println("Enter the number");
    }

    public static boolean num() {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int i = 2;
        while (i < a) {
            if (a%i == 0) {
                return false;
            }
boolean isprime = num();
            if(isprime){
                System.out.println("Its a prime");
            }else {
                System.out.println("its not a prime no");
            }
        }
        return num();
    }
}
