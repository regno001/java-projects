package in.regno.exception.Thread;

public class MultiThreadTest {
    public static void main(String[] args) {
        long s=System.currentTimeMillis();
        System.out.println(System.currentTimeMillis());
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d* ",i);
        }
        System.out.println("\nFirst Task Complete");
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d& ",i);
        }
        System.out.println("\nSecond Task Complete");
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d$ ",i);
        }
        System.out.println("\nThird Task Complete");
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d# ",i);
        }
        System.out.println("\nFour Task Complete");
       long e =System.currentTimeMillis();
       System.out.println(System.currentTimeMillis());
        System.out.printf("Total Time taken %d",e-s);
    }

}
