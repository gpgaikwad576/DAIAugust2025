import utility.Tuple;

import java.util.Scanner;

public class Tester {
    public static void main(String [] args){


        Scanner sc=new Scanner(System.in);
        System.out.print("Input withdrawl account: ");
        long withacc = sc.nextLong();
        System.out.print("\nInput Deposit account: ");
        long depacc = sc.nextLong();

        System.out.print("\nInput amount: ");
        double amount= sc.nextDouble();
        Tuple responses = Account.transaction(withacc,depacc,amount);
        String withSuccess,depSuccess;
        if(responses.rp!= null && responses.rp.isSuccessful){
            withSuccess="Success";
        }
        else{
            withSuccess = "Failure";
        }
        if(responses.rp2!= null && responses.rp2.isSuccessful){
            depSuccess="Success";
        }
        else{
            depSuccess = "Failure";
        }
        System.out.println("Withdraw:"+withSuccess+" "+responses.rp.remark+" |Deposit: "+depSuccess+" "+responses.rp2.remark);
        Account.transaction(withacc,depacc,amount);

    }
}
