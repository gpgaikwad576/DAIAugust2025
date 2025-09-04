package day2;

public class Bank {

	public static void main(String[] args) {
		Account acc1 = new Account(546578, "aaa", 500000);
		Account acc2 = new Account(656278, "bbb", 600000);
		
		System.out.println(acc1.calculateInterest());
		System.out.println(acc2.calculateInterest());
		
		Account.displayInterestRate();

	}

}
