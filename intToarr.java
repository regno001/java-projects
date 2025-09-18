import java.util.Scanner;

public class intToarr {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = input.nextInt();
        String n=String.valueOf(a);

        int[] arr= new int[n.length()];

        for (int i=0;i<n.length();i++) {
            arr[i] = n.charAt(i) - '0';

        }
     for (int i=0;i<arr.length;i++){
         System.out.println(arr[i] + " ");
     }
    }
}
