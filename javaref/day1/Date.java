package day1;

public class Date {

	private int day;
	private String month;
	private int year;
	
	public Date() //default
	{
//		day = 1;
//		month = "Jan";
//		year = 2025;
		this(1, "Jan", 2025);
	}
	
	public Date(int day, String month, int year) //parameterized
	{
		this.day = day;
		this.month= month;
		this.year = year;
	}
	
	public void setDay(int day)
	{
		this.day = day;
	}
	
	public int getDay()
	{
		return day;
	}
	
	public String toString()
	{
		return "Date : " + day +"/" + month + "/" + year;
	}
	
}
