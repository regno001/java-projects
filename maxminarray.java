public class maxminarray {
    public static void main(String[] args) {
        System.out.println("Welocome to min and max\n");
        int[] numArr = ArrayUtility.inputArray();
    int max =max(numArr);
    int min = min(numArr);
        System.out.println("The max num of array "  + max);
        System.out.println("The min num of array "  + min);

    }
    public static  int max(int[] numArr){
        if(numArr.length==0){
            return Integer.MIN_VALUE;
        }
        int max =numArr[0];
        int i =1;
        while(i<numArr.length){
            if(max<numArr[i]){
                max=numArr[i];
            }
            i++;
        }

        return max;
    }
    public static  int min(int[] numArr){
        if(numArr.length==0){
            return Integer.MAX_VALUE;
        }
        int min =numArr[0];
        int i =0;
        while(i<numArr.length){
            if(min>numArr[i]){
                min=numArr[i];
            }
            i++;
        }

        return min;

    }
}
