package day3;

import day2.Employee;
import day2.SalariedEmployee;

public class Payroll {
	
	public static void displayGross(Employee e)
	{
		System.out.println("Gross Salary :" + e.calculateGross());
	}
	
	public static void displayNet(SalariedEmployee e)
	{
		System.out.println("Net Salary :" + e.calculateNet());
	}
	
}
