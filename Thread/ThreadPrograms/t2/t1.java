package in.regno.exception.ThreadPrograms.t2;

public class t1 extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(4000);
            System.out.printf("\nFrom inside run %s",getState());
        } catch (Exception e) {
            throw new RuntimeException(e);

        }
    }
}
