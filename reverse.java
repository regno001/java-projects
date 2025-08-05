import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welocme to Reverse a number");
        System.out.println("Please Enter yout number");
        int a = input.nextInt();
        int reverse= numReverse(a);
        System.out.println("Reverse of your number is " + reverse);
    }
public static int numReverse(int a){
        int newNum = 0;
        while(a>0){
            int digit = a % 10;
            newNum= newNum*10 + digit;
            a/= 10;
        }
return newNum;

}


}


