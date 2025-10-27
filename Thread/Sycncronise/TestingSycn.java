package in.regno.exception.Sycncronise;

public class TestingSycn {
    public static void main(String[] args) {
        long s = System.currentTimeMillis();
        counter c = new counter();
        Updaterthread t1 = new Updaterthread(c);
        Updaterthread t2 = new Updaterthread(c);


        try {
            t1.start();
            t2.start();
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Threwad interrupped" + e.getMessage());
            ;
        }
        long e =System.currentTimeMillis();
        System.out.printf("Final %d and time taken %d", c.getCount(),(e-s));
    }
}
