public class TwoWheeler extends Vehicle{
    private static float insfrac=0.05f;

    TwoWheeler(String regno,String companyname, String model, float price){
        super(regno,companyname,model,price);
    }

    String displayDetails(){
        return "RegNo:"+this.regno+" CompanyName:"+this.companyname+" Model:"+this.model+" Price:"+this.price + " Insurance:" + this.calculateInsurance();
    }

    @Override
    float calculateInsurance(){
        return this.price*insfrac;

    }
}
