import java.util.Scanner;

class DeleteArray {
    public static void main(String[] args) {
        System.out.println("Welcome to the deletion of array");
        int[] DelArr = ArrayUtility.inputArray();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number That you want to delete");
        int numToDel= input.nextInt();
        int[] newArr = deleteNumber(DelArr , numToDel);
        System.out.println("Here is your new Array");
        int i = 0;
        while(i < newArr.length){
            System.out.print(newArr[i]);
            i++;
        }
    }

    public static int[] deleteNumber(int[] DelArr,int numToDel){
      int occ =noofOccurence.noofOccurrences(DelArr,numToDel);
 if(occ==0){
     return DelArr;
 }
      int newSize = DelArr.length-occ;
 int[] newArr = new int[newSize];
 int i =0 ,j=0;
 while(i<DelArr.length){
     if(DelArr[i]!=numToDel){
         newArr[j] = DelArr[i];
         j++;
     }
     i++;
 }
 return newArr;
    }
}
