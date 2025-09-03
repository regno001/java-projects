import java.util.Scanner;
public class Numbergessing{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Welcome to Guess the number ");
            int randomInt=(int)(Math.random()*10);

           int number;
            do{
                System.out.println("Guess the Number");
                number = input.nextInt();
            }while(number != randomInt);
            System.out.println("you guess the number Correctly");
        }
    }

