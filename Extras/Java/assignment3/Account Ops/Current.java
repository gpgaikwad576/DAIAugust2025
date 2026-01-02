import utility.Response;
public class Current extends Account{

    public Current(long accno,String name, double balance){
        super(accno,name,balance);
    }

    @Override
    public Response withdraw(double amount){
        if(amount>50000){
            return new Response(false,"Withdrawing amount greater than 50000");
        }
        else{
            return new Response(true,"");
        }
    }
    public Response  deposit(double amount){
        if(amount <50){
            return new Response(false,"depositing denomination less than 50");
        }
        else{
            return new Response(true,"");
        }
    }


}
