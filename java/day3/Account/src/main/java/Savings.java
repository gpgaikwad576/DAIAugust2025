import utility.Response;
public class Savings extends Account{

    public Savings(long accno,String name, double balance){
        super(accno,name,balance);
    }

    @Override
    public Response withdraw(double amount){
        double rembal= this.balance - amount;
        if(rembal<10000){
            this.balance =this.balance -amount-500;
            return new Response(true,"500 rs penalty");
        }
        this.balance=this.balance-amount;
        return new Response(true,"");
    }

    public Response deposit(double amount){
        this.balance=this.balance + amount;
        return new Response(true,"");
    }
}
