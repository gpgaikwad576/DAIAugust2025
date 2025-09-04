import java.util.concurrent.SynchronousQueue;

public class Account {
    private String accname;
    private int accNo;
    private double balance;

    public Account(String accname, int accNo, double balance) {
        this.accname = accname;
        this.accNo = accNo;
        this.balance = balance;
    }

    // withdraw deposite
    public synchronized void withdraw(double amount ){
        if(balance<amount){
            try{
                System.out.println("Insufficient Balance!");
                wait();
            }
            catch (InterruptedException e){
                System.out.println(Thread.currentThread().getName()+" was in waiting State");
            }
        }
        else{
            this.balance-=amount;
            System.out.println(Thread.currentThread().getName()+" withdraw Rs:"+amount+"\nbalance:"+this.balance );
        }
    }

    public synchronized void deposit(double amount){
        balance+=amount;
        System.out.println(Thread.currentThread().getName()+" Balance:"+this.balance);
        notifyAll();

    }



//    public int getAccNo() {
//        return accNo;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    //Setter
//    private
//
}
