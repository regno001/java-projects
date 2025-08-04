import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Return {
    public static void main(String[] args) {

        greet();
      sum();
    }
    public static int sum(){
        int a = readNumber();

        int b = readNumber();
        int sum = a+b;
        System.out.println("The sum of the number is " + sum);
    return sum;
    }
    public static int readNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = input.nextInt();
        return number;
    }
    public static void greet(){
        System.out.println("Welocme to the calculator");

    }
}
