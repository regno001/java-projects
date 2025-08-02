import java.util.Scanner;

public class Relational {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Age");
        int a = input.nextInt();
        if(a==18){
            System.out.println("Your Are Ready To Gear Up");
        } else if (a>18) {
            System.out.println("Hurray U are so LAte for the adventure");
        }
        else{
            System.out.println("It will take time KIddo1");
        }
    }
}
