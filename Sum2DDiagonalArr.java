import java.util.Scanner;

public class Sum2DDiagonalArr {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Welcome to 2D Search ");
            int[][] numArr = ArrayUtility.input2DArray();
            int sum = leftsum(numArr)+rightsum(numArr);
            System.out.println("the Sum is " + sum);
        }
        public static int leftsum(int[][] numArr){
            int i =0;
            int  Lsum=0;
            while(i<numArr.length){
                int j=0;
                while(j<numArr.length ){
                    if(i==j) {
                        Lsum += numArr[i][j];
                    }
                    j++;
                }
                i++;
            }
            return Lsum;
        }
    public static int rightsum(int[][] numArr){
        int i =0;
        int  rsum=0;
        while(i<numArr.length){
            int j= 0;
            while(j< numArr.length ){
                if (i+j==2)
                    rsum += numArr[i][j];
                j++;
            }
            i++;
        }
        return rsum;
    }

    }

