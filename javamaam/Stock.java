package day5;

public class Stock {

	public static void main(String[] args) {
		Car car = new Car("aaa", "bbb", 1000010);
		
		SerializeData.saveDataToDB(car);
		SerializeData.saveDataToFile(car);
		
		car.test();
	}
}
