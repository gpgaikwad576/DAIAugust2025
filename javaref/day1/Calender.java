package day1;

public class Calender {

	public static void main(String[] args) {
		int i =10;
		DateOld d1 = new DateOld();
		d1.setDate(25, "Aug", 2025);
		DateOld d2 = d1;
	//	d1.day = 28;
		
		d2.printDate();
		
		Date d = new Date();
		System.out.println(i);
		System.out.println(d);
	}

}
