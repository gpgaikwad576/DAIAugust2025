import utility.Response;
import utility.Tuple;
public  abstract class Account {
    public long accountno;
    public String name;
    public double balance ;
    public static Account[] accounts;
    static{
        Savings savings1=new Savings(123434,"Pankaj",100000);
        Savings savings2=new Savings(123435,"Soham",234566);

        Current current1=new Current(123436,"Yug",123464);
        Current current2=new Current(123437,"Khali",678890);
        accounts=new Account[]{savings1,savings2,current1,current2};

    }
    Account( long accountno,String name,double balance){
        this.accountno=accountno;
        this.balance=balance;
        this.name=name;
    }

    static double displayBalance(long account){
        Account acc = Account.find(account);
        return acc.balance;
    }

    static Account find(long accno){
        for(int i=0 ;i<Account.accounts.length;i++){
            if(Account.accounts[i].accountno == accno) return accounts[i];
        }
        return null;
    }



    public static Tuple transaction(long withaccno, long depaccno, double amount){
        Account withacc = Account.find(withaccno);
        Account depacc = Account.find(depaccno);
        if(withacc == null|| depacc==null){
            System.out.println("Account doesn't exist");
            return null;
        }
        Savings s1=null,s2=null;
        Current c1=null,c2=null;

        if (withacc instanceof Savings) {
            s1 = (Savings) withacc;

        } else if (withacc instanceof Current) {
            c1 = (Current) withacc;

        }

        if (depacc instanceof Savings) {
            s2 = (Savings) depacc;

        } else if (depacc instanceof Current) {
            c2 = (Current) depacc;

        }
        Response rp = new Response();
        Response rp2 = new Response();
        rp = (s1!=null?s1:c1).withdraw(amount);
        if(rp.isSuccessful) {
            rp2 = (s2!=null?s2:c2).deposit(amount);
            if(rp2.isSuccessful){
                (s1!=null?s1:c1).deposit(amount);
            }

        }
        return new Tuple(rp, rp2);

    }

    public abstract Response withdraw(double amount);

    public abstract Response deposit(double amount);
}
