package day2;

public class Account {
	
	private static float intrate;
	private int accid;
	private String name;
	private double balance;
	/*
	 * static initialization blocks are used 
	 * to initialize static variables
	 */
	static
	{
		intrate = 6.0f;
	}
	
	static
	{
		System.out.println("Block2");
	}
	
	public Account(int accid, String name, double balance)
	{
		this.accid = accid;
		this.name = name;
		this.balance = balance;
	}
	
	public double calculateInterest()
	{
		return (balance * intrate * 0.4)/100;
	}
	
	public static void displayInterestRate()
	{
		System.out.println("Current Rate of Interest :" + intrate + "%");
	}
}
