import java.sql.SQLOutput;
import java.util.Scanner;
public class GReatestOFNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the No a");
        int a = input.nextInt();
        System.out.println("Enter the No b");
        int b = input.nextInt();
        System.out.println("Enter the No c");
        int c = input.nextInt();
        if(a>b && a>c){
            System.out.println("A is the Greatest No");
        } else if (b>a && b>c) {
            System.out.println("B is the Greatest No");
        }else {
            System.out.println("C is the Greatest no");
        }
    }
}
