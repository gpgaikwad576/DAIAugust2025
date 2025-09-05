package wednesday.account;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        SavingAccout acc1 = new SavingAccout(101,"satyam",15000);
        CurrentAccount acc2 = new CurrentAccount(102,"shivam", 200000);
        SavingAccout acc3 = new SavingAccout(103,"Arbab",12000);



        Account[] account = new Account[]{acc1,acc2,acc3};

        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc3);

        System.out.print("\nWrite amount to be withdrawn from Saving Account " + acc1.getAccNo() +" - ");
        int amount = input.nextInt();
        if(acc1.withdraw(amount)){
            System.out.println("Amount withdrawn - " + amount);
        }

        System.out.print("\nWrite amount to be deposied from Saving Account " + acc2.getAccNo() +" - ");
        amount = input.nextInt();
        if(acc2.deposit(amount)){
            System.out.println("Amount withdrawn - " + amount);
        }


//
//        System.out.println("\n"+acc1);
//        System.out.println(acc2);
//        System.out.println(acc3);

        System.out.print("\nWrite Senders Account Number - ");
        int sender = input.nextInt();

        System.out.print("Write Recieve Account Number - ");
        int reciever = input.nextInt();

        int senderIndex = -1;
        int recieverIndex = -1;

        for( int i = 0; i <  account.length ; i++){
            if(sender == account[i].getAccNo()){
                senderIndex = i;
            }
        }

        for( int i = 0; i <  account.length ; i++){
            if(reciever == account[i].getAccNo()){
                recieverIndex = i;
            }
        }
        System.out.print("Write Amount to be tranferred - ");
        amount = input.nextInt();

        Account.transaction(account[senderIndex],account[recieverIndex],amount);

        System.out.println("\n"+acc1);
        System.out.println(acc2);
        System.out.println(acc3);
    }
}
