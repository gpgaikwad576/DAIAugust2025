package day2;

public class SalariedEmployee extends Employee{
	protected double basic;
	protected static int ptax = 500;

	public SalariedEmployee(int empid, String name, double basic)
	{
		super(empid, name);
//		this.empid = empid;
//		this.name = name;
		this.basic = basic;
	}

	@Override
	public double calculateGross() {
		double hra = basic * 0.4;
		double da = basic *0.15;
		return basic + hra+da;
	}
	
	public double calculateNet()
	{
		double pf = basic * 0.12;
		return calculateGross() - (ptax+pf);
	}
	
	public static void displayTax()
	 {
		 System.out.println(ptax);
	 }
}
