package day4;

import java.util.ArrayList;

public class DemoWrapper {

	public static void main(String[] args) {
		int i = 10;		
		Integer j = Integer.valueOf(i); //primitive to wrapper
		System.out.println(j);
		
		int k = j.intValue(); //wrapper to primitive
		System.out.println(k);
		
		System.out.println(i==j);
		
		int x = 20;
		Integer y = x;  //auto-boxing
		System.out.println(y);
		
		int z = y;  //auto unboxing
		System.out.println(z);
		
		String s = "30";
		int n = Integer.parseInt(s);
		System.out.println(n);
		
		Integer m = Integer.valueOf(s);
		System.out.println(m);
		

	}

}
