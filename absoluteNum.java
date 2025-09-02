import java.util.Scanner;

public class absoluteNum {
    public static void main(String[] args) {
        System.out.println("Absolute number finder");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number for its absolute value ");
        int a = input.nextInt();
        int absolute = a>0 ? a : a * -1 ;
        System.out.println("The Absolute value of " +a  + " is " + absolute);
    }
}
