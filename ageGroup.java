import java.util.Scanner;
public class ageGroup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Age");
        int a = input.nextInt();
        if (a>60 ){
            System.out.println("Welcome Senior");
        }else if (a<60){
            System.out.println("Welcome Adult");
        }else if (a<20){
            System.out.println("Welcome Teen");
        }else {
            System.out.println("Welcome Child");
        }
    }
}
