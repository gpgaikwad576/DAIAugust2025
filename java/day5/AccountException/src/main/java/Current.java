import utility.Response;
import utility.CustomException;

public class Current extends Account{

    public Current(long accno,String name, double balance){
        super(accno,name,balance);
    }

    @Override
    public Response withdraw(double amount){
        try {
            if (amount > 50000) {
                throw new CustomException("Current: Withdrawing amount greater than 50000");

            } else {
                return new Response(true, "");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        return new Response(false,"Exception Occurred");

    }
    public Response deposit(double amount){
        try {
            if (amount < 50) {
                throw new CustomException("Current: depositing denomination less than 50");
            } else {
                return new Response(true, "");
            }
        }catch(CustomException e){
            System.out.println(e);
        }
        return new Response(false,"Exception Occurred");
    }


}
