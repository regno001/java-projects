package in.regno.exception.ThreadPrograms.t2;

public class main {
    public static void main(String[] args) throws InterruptedException {
        t1 t1 = new t1();
        System.out.printf("creted the thread %s ",t1.getState());
        t1.start();
        t1.join();
        System.out.printf("\nThread Finished %s",t1.getState());
    }
}
