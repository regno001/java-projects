public class maxValueFind {
    public static void main(String[] args) {
        System.out.println("Welocme to find the maximum integer");
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int max=Integer.MIN_VALUE;
        for(int num:arr){
            if(max<num){
                max=num;
            }

            }
        System.out.println(max);
        }
    }
