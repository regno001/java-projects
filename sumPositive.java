public class sumPositive {
    public static void main(String[] args) {
        System.out.println("Welcome to adding positive number ");
         int[] arr= {1,2,3,4,5,-1,3,-4};
         int sum=0;
         for (int num:arr){
             if (num<0){
                 continue;
             }
             sum += num;
         }
        System.out.println("Sum of the elemts of the array is " + sum
        );
    }
}

