package day4;

public class DemoString {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";		
		System.out.println(s1==s2); //the same objects
		
		String n1 = new String("hello");
		String n2 = new String("hello");
		System.out.println(n1==n2); //not the same objects
		System.out.println(n1.equals(n2));
		
		String ss ="Good Morning;Good Night";
		
		String [] greetings = ss.split(";");
		for(String g : greetings)
			System.out.println(g);
	}

}
