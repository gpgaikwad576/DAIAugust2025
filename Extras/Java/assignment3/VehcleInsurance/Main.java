package lab.VehcleInsurance;
public class Main {
    public static void main(String [] args){
        FourWheeler F1=new FourWheeler("001","BMW","S250",75000000);
        TwoWheeler w1=new TwoWheeler("002","Honda","Gt350",5000000);

        F1.calculateInsurance();
        w1.calculateInsurance();

        System.out.println("Two Wheeler details:\n" + F1.displayDetails());
        System.out.println("\n");
        System.out.println("Four Wheeler details:\n" + w1.displayDetails());
    }
}
