import java.sql.SQLOutput;
import java.util.Scanner;

public class CircleMath {
    public static void main(String[] args) {
        System.out.println("Circle Area");
        Scanner input=new Scanner(System.in);
        System.out.println("Enetr the radius");
        int r = input.nextInt();
        System.out.println("Area of circle " + Math.PI*r*r);
        System.out.println("Circumfrence of circle " + 2*Math.PI*r);
    }
}
