package Thread;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchEx {
    public static void main(String[] args) {

        CountDownLatch c1 = new CountDownLatch(1);
        CountDownLatch c2 = new CountDownLatch(1);
        CountDownLatch c3 = new CountDownLatch(1);


        Thread t1 = new Thread(){
            @Override
            public void run() {
                System.out.println("Executing T1");
                c1.countDown();
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                try {
                    c1.await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Executing T2");
                c2.countDown();
            }
        };

        Thread t3 = new Thread(){
            @Override
            public void run() {
                try {
                    c2.await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Executing T3");
                c3.countDown();
            }
        };

        Thread t4 = new Thread(){
            @Override
            public void run() {
                try {
                    c3.await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Executing T4");
            }
        };

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
