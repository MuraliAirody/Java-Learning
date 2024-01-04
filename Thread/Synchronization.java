package Thread;

public class Synchronization {
     public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Customer customer1 = new Customer(account);
        Customer customer2 = new Customer(account);
        Thread t1 = new Thread(customer1, "Customer 1");
        Thread t2 = new Thread(customer2, "Customer 2");
        t1.start();
        t2.start();
    }
}

class BankAccount {
    private int balance = 100;

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        balance = balance - amount;
    }
}

class Customer implements Runnable {
    private BankAccount account;

    public Customer(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            makeWithdrawal(20);
            if (account.getBalance() < 0) {
                System.out.println("account is overdrawn!");
            }
        }
    }

    private synchronized void makeWithdrawal(int amount) {
        if (account.getBalance() >= amount) {
            System.out.println(Thread.currentThread().getName() + " is going to withdraw");
            // try {
            //     Thread.sleep(1000);
            // } catch (InterruptedException ex) {
            //     ex.printStackTrace();
            // }
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName() + " completes the withdrawal: "+account.getBalance());
        } else {
            System.out.println("Not enough in account for " + Thread.currentThread().getName() + " to withdraw");
        }
    }
}


