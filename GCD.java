import java.sql.SQLOutput;
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welocme to the gcd Finder");
        System.out.println("Enter the first number");
        int a = input.nextInt();
        System.out.println("Enter the second number");
        int b = input.nextInt();
     int gcd= gcd( a, b);
        System.out.println("Gcd Of the number is " + gcd);
    }
    public static int gcd(int a,int b){
        int gcd=1;
        int i=2;
        int least = smallnum(a,b);
        while(i<=least){
            i++;
            if(a%i==0 && b%i==0){
                gcd = i;
            }
        }
    return gcd;
    }
    public static int smallnum(int num1,int num2){
        if (num1 <num2){
            return num1;
        }else{
            return num2;
        }
    }
}
