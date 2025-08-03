import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        int i=0;
        while (i<=10){
            System.out.println(i);
            i = i+1;
        }
        int j =500;
        while(j>=200){
            System.out.println(j);
            j=j-1;
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the NO");
        int b = input.nextInt();
        while(b<=10){
            System.out.println(b);
            b +=1;
        }
    }
}
