package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceEx {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newSingleThreadExecutor();

        ex.submit(()->{
            System.out.println("T1 running");
        });

        ex.submit(()->{
            System.out.println("T2 running");
        });

        ex.submit(()->{
            System.out.println("T3 running");
        });

        ex.shutdown(); // Main thread signals executor to stop after tasks finish
    }
}
