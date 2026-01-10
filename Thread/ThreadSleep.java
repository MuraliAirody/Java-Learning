package Thread;

public class ThreadSleep {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Test1());
        Thread thread2 = new Thread(new Test1());

        thread1.start();
        thread2.start();
    }
}

class Test1 implements Runnable{

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