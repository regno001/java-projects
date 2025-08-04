import java.util.Scanner;
public class SumOddNUmbers {
    public static void main(String[] args) {
greet();
int result = sum();
        System.out.println(result);
    }
public static void greet(){
    System.out.println("Welcome to the Sum Calculator");
    System.out.println("Enter the odd no ");

    }
public static int sum() {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int i = 1;
    int sum=0;
   while (i<=n) {
     i +=2;
        sum +=i;
    }
    return sum;
}
}

