import java.sql.SQLOutput;
import java.util.Scanner;
public class CompoundIntrest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principle Amount");
        int p = input.nextInt();
        System.out.println("Enter the Time ");
        int t = input.nextInt();
        System.out.println("Enter the Rate");
        int r = input.nextInt();
        int c = p*(1+r/100)*t;
        System.out.println("The ci is" + c);
    }

}
