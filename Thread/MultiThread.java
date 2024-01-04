package Thread;



public class MultiThread  {
   public static void main(String[] args) {
    

    System.out.println("Thread execution starts");

    for(int i = 0;i<10;i++){
        NewThread thread = new NewThread();

        thread.start();
    }

   }
}

class NewThread extends Thread {
    @Override
    public void run() {
        
        System.out.println("Thread "+ Thread.currentThread().threadId()+" Running ");

    }
}
