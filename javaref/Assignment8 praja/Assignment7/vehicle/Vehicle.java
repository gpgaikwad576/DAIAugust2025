package wednesday.vehicle;

public abstract class Vehicle {

    private int regNo;
    private String company;
    private String Model;
    private double price;

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return Model;
    }

    public int getRegNo() {
        return regNo;
    }

    public double getPrice() {
        return price;
    }

    public Vehicle(int regNo, String company, String model, double price) {
        this.regNo = regNo;
        this.company = company;
        Model = model;
        this.price = price;
    }

    public abstract double calculateInsurance();


    @Override
    public String toString() {
        return "Vehicle{" +
                "regNo=" + regNo +
                ", company='" + company + '\'' +
                ", Model='" + Model + '\'' +
                ", price=" + price +
                '}';
    }
}
