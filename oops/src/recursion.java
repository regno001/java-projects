public class recursion {
    public static void main(String[] args) {
        int i =6;
        int sum =0;
        if (i>0){
            sum = i + recursion(i - 1);
            System.out.println(i);
        }
    }
}
