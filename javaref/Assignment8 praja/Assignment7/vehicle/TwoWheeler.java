package wednesday.vehicle;

public class TwoWheeler extends Vehicle{


    public TwoWheeler(int regNo, String company, String model, double price) {
        super(regNo, company, model, price);
    }

    public double calculateInsurance(){

        return super.getPrice() * 0.05;
    }

    public void displayDetails(){
        System.out.format("\n Vehicle Details - >\n Registration number - %d \n company - %s \n Model - %s \n Price - %.2f \n Insurance - %.2f\n",
                super.getRegNo(),super.getCompany(),super.getModel(),super.getPrice(),calculateInsurance());;
    }

}
