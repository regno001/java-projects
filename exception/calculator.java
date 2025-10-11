package in.regno.exception;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        a();

    }
    private static void a(){
        b();
    }
    private static void b(){
        c();
    }
    private static void c(){
        d();
    }
    private static void d(){        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to division Calculator");
        System.out.println("Please enter your two number");
        int a =input.nextInt();
        int b= input.nextInt();
        try {
            int c = a / b;
            System.out.printf("%d result ", c);
//        }catch (ArithmeticException e) {
//            System.out.printf("%s ,Enter valid value",e.getMessage());
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("out of bound array");
//        }
        }catch (Throwable th){
            System.out.println(th.getMessage());
            throw th;
        }}
}
