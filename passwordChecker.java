import java.util.Scanner;

public class passwordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to password Checker");

     String password;
        do{
            System.out.println("Enter the password");
          password = input.next();
        }while(!isValidPassword(password));
        System.out.println("Password Enterd successfully");
    }
    public static boolean isValidPassword(String password){
        return password.length()>6;
    }
}
