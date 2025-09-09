import java.util.Scanner;

public class sumCumulative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Limit ");
        int n= input.nextInt();
        int sum=0;
        for (int i=1;i<=n;i++){
            int innerSum=0;
            for (int j=1;j<=i;j++){
                innerSum +=j;
            }
            sum+=innerSum;
        }
        System.out.println("Sum Of the series is "+sum);
        System.out.println("Name: Rahul");
        System.out.println("Rollno: 47");
        System.out.println("Course: BCA, G1");
    }
}
