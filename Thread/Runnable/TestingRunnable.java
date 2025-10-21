package in.regno.exception.Thread.Runnable;

public class TestingRunnable {
    public static void main(String[] args) {
        printTask p1 = new printTask('*');
        printTask p2 = new printTask('$');
        printTask p3 = new printTask('%');
        printTask p4 = new printTask('^');

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        t1.start();
        t2.start();
        
    }
}
