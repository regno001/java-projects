import java.util.Scanner;

public class Sum2DArr {
    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);
                System.out.println("Welcome to 2D Search ");
                int[][] numArr = ArrayUtility.input2DArray();
                 int sum = sum(numArr);
        System.out.println("the Sum is " + sum);
        System.out.println("Average Of the Arr is" + sum/numArr.length);
                }
                public static int sum(int[][] numArr){
             int i =0;
            int  sum=0;
                 while(i<numArr.length){
                     int j=0;
                     while(j<numArr.length ){
                     sum = sum+ numArr[i][j];
                         j++;
                     }
                     i++;
                 }
                 return sum;
    }

    }

