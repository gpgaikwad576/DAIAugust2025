package day6;

import java.util.ArrayList;
import java.util.List;

import day1.Date;

public class DemoLambda {
	
	public static int operateOnNumber(Function func, int n)
	{
		return func.apply(n);
	}
	
	
	public static List<Integer> operateOnNumbers(Function func, List<Integer> n)
	{
		List<Integer> mapped = new ArrayList<>();
		for(Integer i : n)
		{
			mapped.add(func.apply(i));
		}
		return mapped;
	}

	public static void main(String[] args) {
		int j = 10;
		String s = "java";
		Date d = new Date();
		List<Integer> nums = List.of(12, 13, 14,15);
		
		Function square = (n) -> n*n;
		System.out.println(square.apply(20));
		
		Function factorial = (n) ->
		{
			int facto=1;
			for(int i =1; i<=n ;i++)
			{
				facto *= i;
			}
			return facto;
		};
		System.out.println(factorial.apply(4));
		
		
		int tens = operateOnNumber((n) -> n * 10, 14);
		System.out.println(tens);
		
		int facto = operateOnNumber((n) -> {
			int f=1;
			for(int i =1; i<=n ;i++)
			{
				f *= i;
			}
			return f;
		}, 14);
		System.out.println(facto);
		
		List<Integer> factos = operateOnNumbers((n) -> {
			int f=1;
			for(int i =1; i<=n ;i++)
			{
				f *= i;
			}
			return f;
		}, nums);
		System.out.println(factos);
	}
}
