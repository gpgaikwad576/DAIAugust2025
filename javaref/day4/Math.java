package day4;

public class Math {

	public static void main(String[] args) {
		try {
			int d1 = Integer.parseInt(args[0]);
			int d2 = Integer.parseInt(args[1]);
			
			int res = d1/d2;
			System.out.println(res);
		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("Divisor can not be zero");
		}
		catch (NumberFormatException e) {
			e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("After divide");
	}
}
