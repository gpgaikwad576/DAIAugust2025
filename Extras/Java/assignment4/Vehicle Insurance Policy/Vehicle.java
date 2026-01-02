public abstract class Vehicle {
    String regno;
    String companyname, model;
    float price;

    Vehicle(String regno, String companyname, String model, float price){
        this.companyname=companyname;
        this.regno=regno;
        this.model=model;
        this.price=price;
    }


    abstract float calculateInsurance();


}




