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
        Tuple responses= new Tuple();
        responses.rp.isSuccessful = false;
        responses.rp.remark = "No status";
        responses.rp2.isSuccessful = false;
        responses.rp2.remark = "No status";

        try {
            responses = Account.transaction(withacc, depacc, amount);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        String withSuccess="Failure",depSuccess="Failure";
        try {
            if (responses.rp.isSuccessful) {
                withSuccess = "Success";
            } else {
                withSuccess = "Failure";
            }
            if (responses.rp2.isSuccessful) {
                depSuccess = "Success";
            } else {
                depSuccess = "Failure";
            }
        }
        catch(NullPointerException e){
            System.out.println(e+": Object doesnt exist");
        }

        //System.out.println("Withdraw:"+withSuccess+" "+responses.rp.remark+" |Deposit: "+depSuccess+" "+responses.rp2.remark);

    }
}
