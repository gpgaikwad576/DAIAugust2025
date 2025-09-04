package day2;

public class Math {

	public static void add(int n1, int n2)
	{
		System.out.println("Addition :" + n1+n2);
		
	}
	
	public static void add(int n1, int n2, int n3)
	{
		System.out.println("Addition :" + n1+n2+n3);
	}
	
	public static void add(int n1, float n2)
	{
		System.out.println("Addition :" + n1+n2);
	}
	
	public static void add(float n1, int n2)
	{
		System.out.println("Addition :" + n1+n2);
	}
	
	public static void add(float n1, float n2)
	{
		System.out.println("Addition :" + n1+n2);
	}

	//varArg - 
	public static void addition(int...number)
	{
		int res=0;
		for(int num : number)
		{
			res+=num;
		}
		System.out.println("Addition :" + res);
	}
//	public static int add(int n1, int n2)
//	{
//		return n1+n2;
//	}
}
