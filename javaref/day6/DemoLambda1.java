package day6;

import java.util.ArrayList;
import java.util.List;

public class DemoLambda1 {

	public static List<Integer> operateOnNumbers(Function func, List<Integer> n)
	{
		List<Integer> mapped = new ArrayList<>();
		for(Integer i : n)
		{
			mapped.add(func.apply(i));
		}
		return mapped;
	}
	
	public static int factorial(int n)
	{
		int f=1;
		for(int i =1; i<=n ;i++)
		{
			f *= i;
		}
		return f;
	}
	public static void main(String[] args) {
		List<Integer> nums = List.of(12, 13, 14,15);
		List<Integer> factos = operateOnNumbers
				(DemoLambda1::factorial, nums);
		System.out.println(factos);
		
		List<Integer> abs = operateOnNumbers(Math::abs, nums);
		System.out.println(abs);

	}

}
