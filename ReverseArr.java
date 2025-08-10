public class ReverseArr {
    public static void main(String[] args) {
        System.out.println("Welcome to revesing of an array");
        int[] numArr = ArrayUtility.inputArray();
        reverse(numArr);
        System.out.println("Your Reverserd  Array ");
        int i=0;
        while( i<numArr.length){
            System.out.print(numArr[i]);
            i++;
        }
    }

    public static void reverse(int[] arr) {
        int i = 0;
        while (i < arr.length / 2) {
            int swap = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = swap;
            i++;
        }
    }
}
