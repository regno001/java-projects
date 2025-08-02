import java.util.Scanner;
public class oddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the No ");
    int a = input.nextInt();
    if(a%2==0){
        System.out.println("The no is even" + a);
    }
    else {
        System.out.println("the no is Odd" + a);
    }

    }


}
