//Q.1.Create account class with deposit and withdraw method
//
//        Created a Multithread application for concurrent deposit and withdrawal provided:
//
//a. Amount should be withdrawn only if balance > amount
//b. The withdraw method should wait for deposit if funds are insufficient
//c. After successful deposit withdraw can be completed
public class Account {
    private long accno;
    private String name;
    private double balance;

    public Account(long accno, String name, double balance){
        this.accno = accno;
        this.name = name;
        this.balance = balance;
    }


    public synchronized void withdraw(double amount){
            if (balance < amount) {
                System.out.println("Funds Insufficient");
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else{
                balance-=amount;
                System.out.println(Thread.currentThread().getName()+": "+"Withdrawed successfully"+" Balance:"+balance);
            }

    }

    public synchronized void deposit(double amount){
        balance+=amount;
        System.out.println(Thread.currentThread().getName()+": "+"Deposited successfully"+" Balance:"+balance);
        notifyAll();
    }
}
