package day6;

import java.util.ArrayList;
import java.util.List;

import day1.Date;

public class DemoGenericLambda {
	public static <T> List<T> operateOnData(IFunction<T> func, 
			List<T> data)
	{
		List<T> mapped = new ArrayList<>();
		for(T obj : data)
		{
			mapped.add(func.apply(obj));
		}
		return mapped;
	}

	public static void main(String[] args) {
		
		IFunction<Integer> sqaures = (n) -> n* n;
		
		IFunction<String> toupper = (s) -> s.toUpperCase();
		
		List<Integer> nums = List.of(12, 13, 14,15);
		
		List<String> names = List.of("Avani", "Ajay", "Aditi", "Ayush");
		
		List<Integer> multiplyby5= operateOnData((n) -> n * 5, nums);
		System.out.println(multiplyby5);
		
		List<String> namesupper = operateOnData(String::toUpperCase,
				names);
		System.out.println(namesupper);
		
		

	}

}
