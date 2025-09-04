package day3;

import day2.Employee;
import day2.Manager;
import day2.SalariedEmployee;

public class EmployeePortal {

	public static void main(String[] args) {
		
		SalariedEmployee se = new SalariedEmployee(45845, "aaa", 50000);
		Payroll.displayGross(se);
		Payroll.displayNet(se);
		
		Manager me = new Manager(45845, "aaa", 50000, 15000);
		Payroll.displayGross(me);
		Payroll.displayNet(me);
		
		Employee [] emps = new Employee[3];
		emps[0] = new SalariedEmployee(13243, "aaa", 50000); //Up-casting
		emps[1] = new Manager(657678, "bbb", 70000, 20000);
		emps[2] = new ContractEmployee(456, "ccc", 100, 500);
		
		for(Employee e : emps)
		{
			Payroll.displayGross(e);
			
		}
		
		for(Employee e : emps)
		{
			if (e instanceof SalariedEmployee) {
				SalariedEmployee ss= (SalariedEmployee)e;
				Payroll.displayNet(ss);
				
				//Payroll.displayNet((SalariedEmployee)e);
			}
		
			
		}

	}

}
