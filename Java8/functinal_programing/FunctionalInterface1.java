package Java8.functinal_programing;

public class FunctionalInterface1 {
    public static void main(String[] args) {
        Thread th = null;
        try {
            Runnable runnable = () -> System.out.println("thread created: ");
            th = new Thread(runnable);
            th.setName("new");
            th.setPriority(10);
            th.start();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }


        System.out.println(th.currentThread().getName());
    }
}
