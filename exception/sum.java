package in.regno.exception;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first integer");
        int a = input.nextInt();
        System.out.println("enter the second integer ");
        int b = input.nextInt();
        try{
            int c = a/b;
            System.out.printf("the ans is %d",c);
        }catch (ArithmeticException e){
            System.out.println("Not the Zero one bro");
        }finally {
            System.out.println("Completed");
        }
    }


}
