import java.util.Scanner;

public class fortable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welocme to the table generator for the number ");
        System.out.println("Enter the number");
        int a = input.nextInt();
        for(int i=1; i<11; i++){
            System.out.println(a + " * " + i + " = " + a*i);
        }
    }
}
