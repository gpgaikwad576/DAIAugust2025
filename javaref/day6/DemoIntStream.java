package day6;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DemoIntStream {

	public static void main(String[] args) {		
		int [] arr = {4,7,10, 13, 18, 21, 23, 28,10, 13, 18, 26, 7};
		IntStream stream = Arrays.stream(arr);
		
		List<Integer> lessthan20= stream.distinct().filter((n) -> n <20).boxed().collect(Collectors.toList());
		System.out.println(lessthan20);
		
		stream = Arrays.stream(arr);
		stream.distinct().map((n) -> n*n).forEach((n) -> 
		System.out.println(n));
		
		stream = Arrays.stream(arr);
		stream.distinct().sorted().forEach(System.out::println);
		
		stream = Arrays.stream(arr);
		OptionalInt min= stream.distinct().min();
		if(min.isPresent())
			System.out.println(min.getAsInt());
		
		stream = Arrays.stream(arr);
		OptionalInt max= stream.distinct().max();
		if(max.isPresent())
			System.out.println(max.getAsInt());
		
		
		stream = Arrays.stream(arr);
		OptionalDouble ave= stream.distinct().average();
		if(ave.isPresent())
			System.out.println(ave.getAsDouble());
		

	}

}
