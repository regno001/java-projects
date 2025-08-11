public class mergeArr {
    public static void main(String[] args) {
        System.out.println("Welcome to merging sroting array");
        int[] arr1 = ArrayUtility.inputArray();
        int[] arr2 = ArrayUtility.inputArray();
        int[] merge=merge(arr1, arr2);
        int i=0;
        while(i<merge.length){
            System.out.print(merge[i]);
            i++;
        }

    }
    public static int[] merge(int[] arr1,int[] arr2){
     int newSize= arr1.length + arr2.length;
     int[] newArr= new int[newSize];
     int i=0 ,j=0, k=0;
     while(i<arr1.length || j< arr2.length){
        if(j== arr2.length || (i< arr1.length && arr1[i] < arr2[j])){
            newArr[k]=arr1[i];
            i++;
            k++;
        }else{
            newArr[k]=arr2[j];
            k++;
            j++;
        }
    }

     return newArr;
    }
}
