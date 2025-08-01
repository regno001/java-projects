import java.util.Scanner;
public class Userinput {
    public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=input.nextLine();
        System.out.println("Good morning" + name);
        System.out.println("Enter your age: ");
        int age =input.nextInt();
        System.out.println("Good to see that You Turn " + age);

    }
}
