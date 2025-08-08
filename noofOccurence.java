import java.util.Scanner;

public class noofOccurence {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Occurrences");
        Scanner input = new Scanner(System.in);
        int[] numArr = ArrayUtility.inputArray();
        System.out.println("Now enter the numbe you want to find");
        int num = input.nextInt();
        int occurrence = noofOccurrences(numArr, num);
        System.out.println("Your element found " + occurrence + " Times in the array");

    }
    public static int noofOccurrences(int[] numArr, int num) {
        int occ = 0;
        int i = 0;
        while(i<numArr.length){
if(numArr[i]==num){
    occ++;
}
i++;
        }
    return occ;
    }

}

