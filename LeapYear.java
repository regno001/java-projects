import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the YEar");
        int a = input.nextInt();
        if (a%4==0 && a%100!=0){
            System.out.println("This is a leap year");
        }
        else if (a%400==0){
            System.out.println("The Year is leap Year");
        }else {
            System.out.println("The year is not a leap year");
        }
    }
}
