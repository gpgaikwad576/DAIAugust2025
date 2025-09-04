package day2;

import day1.DateOld;

public class DemoArray {
	public static void main(String[] args) {
		 int [] arr = {1,2,3,4,5,6};		 
		 for (int i =0; i< arr.length; i++)
		 {
			 System.out.println(arr[i]);
		 }

		 System.out.println("------------------");
		 //for each : for(datetype var : collection)
		 for(int a : arr)
		 {
			 System.out.println(a);
		 }
		 
		 DateOld [] dd = new DateOld[2];
		 dd[0] = new DateOld();
		 dd[1] = new DateOld();
		 dd[0].setDate(12, "Aug", 2020);
		 dd[1].setDate(10, "Aug", 2020);
		 
		 for(DateOld d : dd)
		 {
			 d.printDate();
		 }
	}

}
