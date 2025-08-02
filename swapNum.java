import java.util.Scanner;
public class swapNum {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter a Number");
        int a = Input.nextInt();
        System.out.println("Enter b Number");
         int b = Input.nextInt();

        System.out.println("After Swapping");
        int c =a ;
        a = b;
        b =  c;
        System.out.println(" a = " + a);
        System.out.println("b = " + b);
    }
}
