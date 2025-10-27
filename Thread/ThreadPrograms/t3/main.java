package in.regno.exception.ThreadPrograms.t3;

public class main {
    public static void main(String[] args) throws InterruptedException {
        t1 t1 = new t1(1);
        t1 t2 = new t1(2);
        t1 t3 = new t1(3);

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
    }
}
