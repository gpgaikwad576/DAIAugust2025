package day1;

public class DateOld {
	
	//instance variables
	private int day;
	private String month;
	private int year;
	
	public void setDate(int d,String m, int y)
	{
		day = d;
		month=m;
		year = y;
	}
	
	public void printDate()
	{
		System.out.println("Date : " + day +"/" + month + "/" + year);
	}

}
