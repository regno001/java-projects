import java.util.Scanner;
public class perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcom to Perimeter Calculator");
        System.out.println("Enter the Length of Rectangle");
        int a = input.nextInt();
        System.out.println("Enter the Bredth of rectangle");
        int b = input.nextInt();
        int c = 2*(a+b);
        System.out.println("PAremeter of rectangle  =" + c);

    }
}
