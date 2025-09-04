package day3;

import day2.Employee;

public class ContractEmployee extends Employee{

	protected int hrs;
	protected int rate;
	public ContractEmployee(int empid, String name,int hrs, int rate) {
		super(empid, name);
		this.hrs = hrs;
		this.rate = rate;
	}
		
	@Override
	public double calculateGross() {

		return hrs*rate;
	}
}
