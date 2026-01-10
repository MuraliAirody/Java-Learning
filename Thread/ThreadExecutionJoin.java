package Thread;

public class ThreadExecutionJoin {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                System.out.println("Executing T1");
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                System.out.println("Executing T2");
            }
        };

        Thread t3 = new Thread(){
            @Override
            public void run() {
                System.out.println("Executing T3");
            }
        };

        Thread t4 = new Thread(){
            @Override
            public void run() {
                System.out.println("Executing T4");
            }
        };

        System.out.println("Main Thread");

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t4.start();
    }
}
