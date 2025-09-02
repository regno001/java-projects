import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the day Detector ");
        System.out.println("enter the day of the Week in number ");
        int day = input.nextInt();
        oldswitch(day);
        newSwitch(day);

    }
    public static void oldswitch(int day){
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("Monday");
                break;
            case 5:
                System.out.println("Monday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invaid day");
                break;

        }
    }
    public static void newSwitch(int day){
        String ouput= switch (day){
            case 1 -> "Monday";
            case 2 -> "tuesday";
            case 3 -> "wednesday";
            case 4 -> "thrusday";
            case 5 -> "friday";
            case 6 -> "saturday";
            case 7 -> "sunday";
            default-> "Invalid ";
        };
        System.out.println(ouput + " The lovely day of the week ");
    }
}
