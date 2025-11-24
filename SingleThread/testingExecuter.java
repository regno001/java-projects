package in.regno.exception.executer.SingleThread;

import in.regno.exception.Thread.Runnable.printTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors; 

public class testingSingleThreadExecuter {
    public static void main(String[] args) {
        // ✅ Correct method name is newSingleThreadExecutor(), not newSingleThreadExecuter()
        ExecutorService service = Executors.newSingleThreadExecutor();

        // Assuming printTask implements Runnable
        printTask p = new printTask("@");

        // ✅ Submit the task for execution
        service.execute(p);

        // ✅ Always shut down the ExecutorService
        service.shutdown();


        service.execute(p);
    }
}


