package in.regno.exception.Thread;

public class secondtak  extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d@ ",i);
        }
        System.out.println("\nSecond Task Complete");
    }
}
