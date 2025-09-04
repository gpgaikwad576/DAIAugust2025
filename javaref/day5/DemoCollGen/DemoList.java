package day5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoList {

	public static void main(String[] args) {
		List lst = new ArrayList<>();
		lst.add(100);
		lst.add(34.7f);
		lst.add("java");
		lst.add('a');
		lst.add(true);
		lst.add("java");
		
		System.out.println(lst);
		
		lst.remove(2);
		lst.remove(true);
		
		System.out.println(lst);
		
		System.out.println(lst.get(3));
		
		System.out.println("-----------------");
		for(int i=0; i<lst.size();i++)
		{
			System.out.println(lst.get(i));
		}
		
		System.out.println("-----------------");
		for(Object o : lst)
		{
			System.out.println(o);
		}

		System.out.println("-----------------");
		Iterator it= lst.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		System.out.println("-----------------");
	 	Integer obj= (Integer)lst.get(2);
	 	System.out.println(obj);
		
	}

}
