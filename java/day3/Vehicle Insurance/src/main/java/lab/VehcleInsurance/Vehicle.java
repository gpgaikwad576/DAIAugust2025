package lab.VehcleInsurance;

public abstract class Vehicle{
    public String regno;
    public String companyname, model;
    public float price;

    public Vehicle(String regno,String companyname,String model,float price){
        this.companyname=companyname;
        this.regno=regno;
        this.model=model;
        this.price=price;
    }


    public abstract float calculateInsurance();


}




