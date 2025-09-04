package day6;

public class Lambdas {

	public static void main(String[] args) {
		Printable p = new Printable() {			
			@Override
			public void print() {				
				System.out.println("In inner class");
			}
		};
		p.print();
	}

}
