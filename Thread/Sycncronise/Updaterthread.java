package in.regno.exception.Sycncronise;

public class Updaterthread  extends  Thread{
    private final counter counter;

    public Updaterthread(counter counter) {
        this.counter = counter;
    }
public void run(){
    for (int i = 0; i < 10000; i++) {
        counter.increment();
    }
}
}
