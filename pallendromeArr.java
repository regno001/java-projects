public class pallendromeArr {
    public static void main(String[] args) {
        System.out.println("Welcome to the Pallendrome Array");
        int[] numArr = ArrayUtility.inputArray();
        boolean isPalen=isPallendrome(numArr);
        if(isPalen){
            System.out.println("your Arr is Palendrome");
        }else {
            System.out.println("Not a pallendrome");
        }
        int i=0;
        while(i<numArr.length){
            System.out.print(numArr[i]);
            i++;
        }
    }
public static boolean isPallendrome(int[] numArr){
      int i =0 ;
      while(i<numArr.length/2){
          if(numArr[i] != numArr[numArr.length-1-i]){
              return false;

          }
          i++;
      }
        return true;
}

}
