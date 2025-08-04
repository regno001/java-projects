import java.util.Scanner;

public class parameter {
    public static void main(String[] args) {

        System.out.println(sum(4,7));
        System.out.println(sum(5,2));
        System.out.println(sum(2,7));
        System.out.println(sum(8,7));

    }
    public static int sum(int first , int second){
        System.out.println("First num recived " + first);
        System.out.println("Second num recieved " + second);
        int sum= first+second;
        System.out.println("Sum of them will be ");
       return sum;
    }
}
