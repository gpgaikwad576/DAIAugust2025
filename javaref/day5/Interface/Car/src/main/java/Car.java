public class Car implements SerializeToFile,SerializeToDB{
    private String make;
    private String model;
    private double price;

    public Car(String make, String model, double price){
        super();
        this.make = make;
        this.model = model;
        this.price = price;
    }


    public String toString(){
        return make+" "+model+" "+price;
    }

    @Override
    public void saveToDB(){
        System.out.println("Saving to Database");
    }

    @Override
    public void saveToFile(){
        System.out.println("Saving to File");
    }

    @Override
    public void test(){
        SerializeToFile.super.test();
    }
    public static void main(String[] args){
        Car car = new Car("honda","dsds",234);
        car.test();
    }

}
