import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("the greater number ");
        System.out.println("enter your first number ");
        int a = input.nextInt();
        System.out.println("enter your Second number ");
        int b = input.nextInt();
//        int greaternum;
//        if(a>b){
//            System.out.println(a + "is the greatest");
//        }else{
//            System.out.println(b + "is the greatest number");
//        }
    int greaternum= a>b ? a:b;
        System.out.println(greaternum + " is the greatest number");
    }
}
