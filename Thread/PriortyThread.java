package Thread;

public class PriortyThread {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();

        System.out.println("Thread 1 priority: " + t1.getPriority());
        System.out.println("Thread 2 priority: " + t2.getPriority());
        System.out.println("Thread 3 priority: " + t3.getPriority());

        t1.setPriority(2);
        t2.setPriority(8);
        t3.setPriority(4);

        System.out.println("Thread 1 priority: " + t1.getPriority());
        System.out.println("Thread 2 priority: " + t2.getPriority());
        System.out.println("Thread 3 priority: " + t3.getPriority());

        System.out.println(
                "Currently Executing Thread : "
                        + Thread.currentThread().getName());

        System.out.println(
                "Main thread priority : "
                        + Thread.currentThread().getPriority());  //5 : by default thread priority depends on main thread priority

        // Main thread priority is set to 10
        Thread.currentThread().setPriority(10);  

        System.out.println(
                "Main thread priority : "
                        + Thread.currentThread().getPriority());
    }
}

class Test extends Thread {

    @Override
    public void run() {
        System.out.println("inside run method of Test Thread class");
    }

}
