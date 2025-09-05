package wednesday.account;

public class SavingAccout extends Account{

    public SavingAccout(long accNo, String name, double balance) {
        super(accNo,name,balance);

    }

    public boolean withdraw(int amount){

        if (super.getBalance() - amount >= 10000){
            super.setBalance(super.getBalance() - amount);
//            System.out.format("\nAmount withdraw\nCurrent balance - %f \n",super.getBalance());
            return true;
        }
        else if (super.getBalance() - amount > 500 && super.getBalance() - amount < 10000){

            super.setBalance(super.getBalance() - amount - 500);
            System.out.format("\nAmount withdraw with penalty\n");
            return true;
        }

        else{
            System.out.println("\nInsuffient Balance to tranfer amount");
            return false;
        }



        }
    public boolean deposit(int amount){
        if(amount <= 0){
            System.out.println("\nCant transfer negative amount");
            return false;
        }
        else{
            super.setBalance(super.getBalance()+amount);
//            System.out.format("Amount deposited \nCurrent balance - %f \n",super.getBalance());
            return true;
        }
    }

    }





