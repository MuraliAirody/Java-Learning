package Thread.Synch;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairReentrantLockEx {
    public static final Lock lock = new ReentrantLock(true);

    public static void main(String[] args) {
        Runnable task = () -> {
            String threadName = Thread.currentThread().getName();
//            System.out.println("Current Thread outside block: " + threadName);

            lock.lock();
            try {
                System.out.println("Current Thread Inside the block: " + threadName);

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        };

        for(int i = 1; i<=5;i++){
            new Thread(task,"Thread-> "+i).start();
        }
    }
}

//synchronized and fair ReentrantLock may appear similar in simple examples, but they differ fundamentally: synchronized provides no fairness guarantee and allows barging, whereas a fair ReentrantLock guarantees FIFO acquisition among waiting threads and prevents starvation.