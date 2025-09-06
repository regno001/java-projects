import java.util.Scanner;

public class FebonachiRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number for Series");
        int count = input.nextInt();
        System.out.println();
        for (int i = 1; i <= count; i++) {
            System.out.println(febo(i) + " ");
        }
    }

    public static int febo(int position) {
        if (position == 1) {
            return 0;
        }
        if (position == 2) {
            return 1;
        }
        return febo(position - 1) + febo(position - 2);
    }
}
