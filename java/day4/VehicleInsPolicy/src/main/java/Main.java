public class Main {
    public static void main(String [] args){
        FourWheeler F1=new FourWheeler("001","BMW","S250",75000000);
        TwoWheeler w1=new TwoWheeler("002","Porsche","Gt350",5000000);
        Policy p=new Policy();

        F1.calculateInsurance();
        w1.calculateInsurance();

        System.out.println(F1.displayDetails());
        System.out.println("Insurance amount:"+p.display(F1)+"\n");
        System.out.println(w1.displayDetails());
        System.out.println("Insurance amount:"+p.display(w1));
    }
}
