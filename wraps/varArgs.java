package in.regno.exception.wraps;

public class varArgs {
    public static void main(String[] args) {
        System.out.println(sum(4,5));
        System.out.println(sum(4,5,6,6));
    }
    public static int sum(int... a){
        int sum =0 ;
        for (int i : a) {
            sum+=i;
        }
        return sum;
    }



}
