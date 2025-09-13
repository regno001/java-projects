import java.util.Scanner;

public class Sumarr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Row of arr");
        int r = input.nextInt();
        System.out.println("Enter the Column of arr");
        int c = input.nextInt();
        int[][] arr = new int[r][c];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(i + "" + j);
                arr[i][j] = input.nextInt();

            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr.length; j++) {

                sum += arr[i][j];
            }
            System.out.println(sum);
        }


    }

}
