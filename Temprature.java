import java.util.Scanner;
public class Temprature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temprature In fahrenheit");
        int f = input.nextInt();
        int c = (f-32)*5/9;
        System.out.println("Temprature in celcius" +c);
    }
}
