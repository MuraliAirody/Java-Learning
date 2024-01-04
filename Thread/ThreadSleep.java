package Thread;

public class ThreadSleep {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Test());
        Thread thread2 = new Thread(new Test());

        thread1.start();
        thread2.start();
    }
}

class Test implements Runnable{

    @Override
    public void run() {
        try {
            for(int i=1;i<=10;i++){
            Thread.sleep(1000);

            System.out.println(i);
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}