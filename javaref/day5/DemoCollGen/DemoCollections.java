package day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoCollections {

	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<>();
		lst.add(24);
		lst.add(7);
		lst.add(10);
		lst.add(21);
		lst.add(4);
		
		Collections.sort(lst);
		System.out.println(lst);
		
		int index = Collections.binarySearch(lst, 10);
		System.out.println("Found at :" + index);
		
		System.out.println(Collections.min(lst));
		System.out.println(Collections.max(lst));
		
		Collections.reverse(lst);
		System.out.println(lst);

	}

}
