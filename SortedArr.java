import java.sql.SQLOutput;

public class SortedArr {
    public static void main(String[] args) {

        System.out.println("Welocme to the Array Sorting");
        int[] sortArr = ArrayUtility.inputArray();
         boolean isInc = isIncreasing(sortArr);
         boolean isDec=isDecreasing(sortArr);
         if(isInc || isDec){
             System.out.println("Array is Sorted");
         }else {
             System.out.println("Array is not sorted");
         }
    }
    public static boolean isIncreasing(int[] sortArr) {
       int i =1;
       while(i<sortArr.length){
           if(sortArr[i]<sortArr[i-1]){
               return false;
           }
               i++;
       }
        return true;

    }
    public static boolean isDecreasing(int[] sortArr) {
            int i =1;
            while(i<sortArr.length){
                if(sortArr[i-1]< sortArr[i]){
                    return false;
                }
                i++;
            }
            return true;

    }
    }
