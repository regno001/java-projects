package in.regno.exception.ThreadPrograms.t3;

public class t1 extends Thread{
    private final int threadNumber;

    public t1(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        System.out.printf("%s Thread Starting- %d\n",Thread.currentThread().getName(),threadNumber);
         try{
             Thread.sleep(5000);
         }catch (InterruptedException e){
             throw new RuntimeException(e);

         }
        System.out.printf("%s Thread Ended -%d\n",Thread.currentThread().getName(),threadNumber);
    }
    }


