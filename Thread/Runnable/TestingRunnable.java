package in.regno.exception.Thread.Runnable;

public class TestingRunnable {
    public static void main(String[] args) {
        printTask p1 = new printTask('*');
        printTask p2 = new printTask('$');
        printTask p3 = new printTask('%');
        printTask p4 = new printTask('^');

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(p3);
        Thread t4 = new Thread(p4);
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(2);
        t3.setPriority(3);
        t4.setPriority(4);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
    }
}
