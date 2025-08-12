import java.util.Scanner;

public class Search2dArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to 2D Search ");
        int[][] numArr = ArrayUtility.input2DArray();
        System.out.println("The Enterd No you Want to search");
        int num = input.nextInt();
        boolean isFound = search(numArr, num);
        if (isFound) {
            System.out.println("Your number Was found ");
        } else {
            System.out.println("Does not Found");
        }
    }

    public static boolean search(int[][] numArr , int num){
      int i=0;
      while(i<numArr.length){
         int j=0;
         while(j<numArr.length){
             if(numArr[i][j]==num){
                 return true;
             }
             j++;
         }
          i++;


      }
        return false;
    }
}
