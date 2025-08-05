import java.sql.SQLOutput;
import java.util.Scanner;
public class lcm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = input.nextInt();
        System.out.println("Enter the second Number");
        int b = input.nextInt();
        int i = 1;
        while (i <= b) {
            int factor = a * i;
            if (factor % b == 0) {
                System.out.println("The Lcm is" + factor);
                break;
            }
                i++;
            }
        }

    }

