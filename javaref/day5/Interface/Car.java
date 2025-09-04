package day5;

public class Car implements SerializeToFile, SerializeToDB{

	private String make;
	private String model;
	private double price;
	public Car(String make, String model, double price) {
		super();
		this.make = make;
		this.model = model;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", price=" + price + "]";
	}
	@Override
	public void saveToDB() {
		
		System.out.println("Saving to DataBase");
	}
	@Override
	public void saveToFile() {
		
		System.out.println("Saving to File");
	}
	
	@Override
	public void test() {
		SerializeToDB.super.test();
	}
	
	
}
