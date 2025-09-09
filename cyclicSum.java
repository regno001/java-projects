import java.util.Scanner;

public class cyclicSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number");
        String s = input.next();
        int n= s.length();
        int sum=0;
        for(int i=0;i<n;i++){
            int initialSum=0;
            for (int j=i;j<n;j++){
                initialSum+=Character.getNumericValue(s.charAt(j));

            }
            sum+=initialSum;
        }
        System.out.println("Sum Of the series is "+sum);
        System.out.println("Name: Rahul");
        System.out.println("Rollno: 47");
        System.out.println("Course: BCA, G1");
    }
}
