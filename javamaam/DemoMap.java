package day5;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DemoMap {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		
		map.put(100, "one");
		map.put(200,  "two");
		map.put(300, "three");
		map.put(300, "four");
		
		System.out.println(map);
		
		map.remove(300);
		System.out.println(map);
		
		String value = map.get(100);
		System.out.println(value);
		
		System.out.println("----------------");
		Set<Integer> keys = map.keySet();
		for(Integer key : keys)
		{
			System.out.println(key + "->" + map.get(key));
		}
		
		System.out.println("----------------");
	    Set<Entry<Integer, String>> entries= map.entrySet();
	    for(Entry<Integer, String> entry : entries)
	    {
	    	System.out.println(entry.getKey() + "->"+ entry.getValue());
	    }

	   
	}

}
