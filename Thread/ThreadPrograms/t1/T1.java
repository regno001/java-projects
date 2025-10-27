package in.regno.exception.ThreadPrograms.t1;

public class T1 extends Thread{
    private final int threadNumber;

    public T1(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("\nHello From Thread %d ",threadNumber);
        }
    }
}
