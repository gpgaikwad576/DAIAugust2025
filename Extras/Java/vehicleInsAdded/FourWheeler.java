public class FourWheeler extends Vehicle {
    private static float insfrac=0.15f;
    public FourWheeler(String regno, String companyname, String model, float price){
        super(regno,companyname,model,price);
    }

    public String displayDetails(){
        return " RegNo: "+this.regno+" CompanyName: "+this.companyname+" Model: "+this.model+" Price: "+this.price + " Insurance: " + this.calculateInsurance();
    }
    @Override
    public float calculateInsurance(){
        return this.price*insfrac;

    }
}
