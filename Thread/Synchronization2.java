package Thread;

public class Synchronization2 {
    public static void main(String args[]) {
        Table obj = new Table();// only one object
        MyThread1 t1 = new MyThread1(obj,5);
        MyThread1 t2 = new MyThread1(obj,100);
        t1.start();
        t2.start();
    }
}

class Table {
     synchronized void printTable(int n) {// synchronized method
        for (int i = 1; i <= 1000; i++) {
            System.out.println(n);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}

class MyThread1 extends Thread {
    Table t;
    int n;

    MyThread1(Table t, int n) {
        this.t = t;
        this.n = n;
    }

    public void run() {
        t.printTable(n);
    }

}
