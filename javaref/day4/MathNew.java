package day4;

public class MathNew {

	/*
	 * throws keyword is used to declare an exception
	 * This is way by which a method tells all its calling methods 
	 * that there is an unhandled exception
	 */
	public static void divide(String n1, String n2) throws ArithmeticException,
	ArrayIndexOutOfBoundsException, NumberFormatException
	{
		int d1 = Integer.parseInt(n1);
		int d2 = Integer.parseInt(n2);
		
		int res = d1/d2;
		System.out.println(res);
	}
	public static void main(String[] args) {
		try {
			divide(args[0], args[1]);
		}
		//Multi-catch block
		catch (ArithmeticException | ArrayIndexOutOfBoundsException 
				|NumberFormatException e) {
			System.out.println(e);
		}
	}

}
