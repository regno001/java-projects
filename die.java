import java.util.Scanner;

public class die {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 0 to start" );
        int a=input.nextInt();
        int b= (int)Math.abs(Math.random()*6);
        if (a==0){
            System.out.println(b);
        }
    }
}
