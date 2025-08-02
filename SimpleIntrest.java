import java.sql.SQLOutput;
import java.util.Scanner;
public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principle Amount");
        int p = input.nextInt();
        System.out.println("Enter the Time ");
        int t = input.nextInt();
        System.out.println("Enter the Rate");
        int r = input.nextInt();
        int s = (p*r*t)/100;
        System.out.println("The si is" + s);
    }

}
