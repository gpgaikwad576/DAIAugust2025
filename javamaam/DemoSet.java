package day5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DemoSet {

	public static void main(String[] args) {		
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(23);
		set.add(7);
		set.add(10);
		set.add(7);
		set.add(10);
		set.add(18);
		
		System.out.println(set);
		
		set.remove(18);
		System.out.println(set);
		
		System.out.println("---------------");
		for(Integer i : set)
		{
			System.out.println(i*i);
		}
		
		System.out.println("---------------");
		Iterator<Integer> it = set.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		System.out.println(set.contains(7));
	

	}

}
