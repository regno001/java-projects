import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        int[] arr ={3,4,7,8,65,642,234,356,876,235};
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to array searching");
        System.out.println("enter the no you want to search");
        int num = input.nextInt();
      boolean isFound = isFound(arr,num);
      if (isFound){
          System.out.println("Your number is found" );
      }else{
          System.out.println("your number is not found");
      }
    }
    public static boolean isFound(int[] arr,int num){
      int i = 0;
      while(i<arr.length){
          if (arr[i]==num){
              System.out.println("at index "+ i);
              return true;

          }
          i++;
      }
        return false;
    }
}
