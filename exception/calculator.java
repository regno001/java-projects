package in.regno.exception;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to division Calculator");
        System.out.println("Please enter your two number");
        int a =input.nextInt();
        int b= input.nextInt();
        try{
            int c = a/b;
            System.out.printf("%d result ",c);
        }catch (ArithmeticException e) {
            System.out.printf("%s ,Enter valid value",e.getMessage());
        }

    }

}
