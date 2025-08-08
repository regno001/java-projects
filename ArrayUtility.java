import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element");
        int size =input.nextInt();
        int[] num=new int[size];
        int i = 0;
        while(i<size){
            System.out.println("Enter the element" + (i+1) + ": ");
            num[i]=input.nextInt();
            i++;
        }
        return num;
    }
}
