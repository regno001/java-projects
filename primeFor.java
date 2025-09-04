import java.util.Scanner;

public class primeFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = input.nextInt();

        System.out.println("your Number is " + (primeInt(a) ? "Prime" : "not Prime"));
    }
    public static boolean primeInt(int a){
        for (int i=2;i<=a;i++){
            if (a%i==0){
               return false;

            }
            else{
                return true;
            }
        }
    return primeInt(a);
    }
}
