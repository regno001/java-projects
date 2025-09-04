import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        System.out.println("Welocme to find the maximum integer");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Size of arr");
        int size = input.nextInt();
        int[] arr= new int[size];
        for (int i=0; i<size;i++){
            System.out.println("Enter the element" + (i+1) + ":" );
            arr[i]=input.nextInt();
        }
        System.out.println("Enter the Element to count");
        int max=input.nextInt();
        int count=0;
        for(int num:arr){
            if(max==num){
                count++;
            }

        }
        System.out.println("the element occur "+ count + " Times") ;
    }

}
