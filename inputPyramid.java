import java.util.Scanner;

public class inputPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Pyramid Maker");
        System.out.println("Enter The number");
        int a = input.nextInt();
        System.out.println("Here is the Pyramid");
        Pattern(a);
        System.out.println("here is the reverse Pyramid");
        Pattern2(a);
        System.out.println("Here are the Next Pyramid");
         Pattern3(a);
    }
    public static void Pattern(int num) {
        int i = 0;
        while(i < num ){
            int p = 0;
            while(p <= i){
                System.out.print("* ");
                p++;
            }
            System.out.println();
            i++;
        }

    }
    public static void Pattern2(int num) {

        int i = num;
        while (i > 0) {
            int p = 0;
            while (p < i) {
                System.out.print("* ");
                p++;
            }
            System.out.println();
            i--;
        }
    }
    public static void Pattern3(int num) {

        int i = num;
        while (i > 0) {
            int j = 0;
            while(j < i-1){
                System.out.print("  ");
                j++;
            }
            int p = 0;
            while (p <= (num-i)) {
                System.out.print("* ");
                p++;
            }
            System.out.println();
            i--;
        }
    }
}
