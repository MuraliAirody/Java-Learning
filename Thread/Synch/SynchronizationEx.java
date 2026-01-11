package Thread.Synch;

//JVM does not guarantee lock acquisition order for intrinsic locks.
//Threads may experience lock starvation.
//There is no fairness configuration.

public class SynchronizationEx {

    public static final  Object lock = new Object();

    public static void main(String[] args) {
        Runnable task = ()->{
            String threadName = Thread.currentThread().getName();
            System.out.println("Current Thread outside block: "+threadName);

            synchronized (lock){
                System.out.println("Current Thread Inside the block: "+threadName);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        for(int i = 1; i<=5;i++){
            new Thread(task,"Thread-> "+i).start();
        }
    }
}
