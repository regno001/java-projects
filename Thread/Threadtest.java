package in.regno.exception.Thread;

public class Threadtest {
    public static void main(String[] args) {

        long s=System.currentTimeMillis();


        Thread t =new FirstTAst();
        Thread t2 = new secondtak();
        Thread t3= new thirdtask();
        System.out.println("\nStarting first tast");
        t.start();
        System.out.println("\n Starting Second");
        t2.start();
        System.out.println("\n starting third");
        t3.start();


        long e =System.currentTimeMillis();
        System.out.printf("Total Time taken %d",(e-s));
    }
}
