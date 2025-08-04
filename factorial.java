import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Given number");
        int a = input.nextInt();
        int sum = 1;
        int i=1;
        while(i<=a){
            sum = sum*i;
            i++;

        }

        System.out.println("Factorial" + sum);
    }
}
