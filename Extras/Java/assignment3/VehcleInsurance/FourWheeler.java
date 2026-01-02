package lab.VehcleInsurance;

public class FourWheeler extends Vehicle {
    private static float insfrac=0.10f;
    public FourWheeler(String regno,String companyname, String model, float price){
        super(regno,companyname,model,price);
    }


    public String displayDetails(){
        return "Insurance Fraction:"+insfrac+"\nRegNo:"+this.regno+"\nCompanyName:"+this.companyname+"\nModel:"+this.model+"\nPrice:"+this.price + "\nInsurance:" + this.calculateInsurance();
    }
    @Override
    public float calculateInsurance(){
        return this.price*insfrac;

    }
}
