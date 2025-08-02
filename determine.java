import java.sql.SQLOutput;
import java.util.Scanner;
public class determine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The number =");
        int a = input.nextInt();
        if (a==0){
            System.out.println("The Number is LIke YOu Its Zeero");
        } else if (a>0) {
            System.out.println("THe no is Postive" + a);
        }else {
            System.out.println("The no is negative" +a);
        }
    }
}
