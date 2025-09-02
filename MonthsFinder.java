import java.util.Scanner;

public class MonthsFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ente the number of the month");
        int a = input.nextInt();
         month(a);
    }
    public static void month(int a){
        String display= switch (a){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "There are only 12 months , Are you from mars?";
        };
        System.out.println("Are you looking for " + display );
    }
}
