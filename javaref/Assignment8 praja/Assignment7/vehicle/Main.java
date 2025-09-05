package wednesday.vehicle;

public class Main {
    public static void main(String[] args) {

        TwoWheeler tw = new TwoWheeler(1001,"Yamaha","y221",50000);
        FourWheeler fw = new FourWheeler(5001,"Honda","city",400000);
        System.out.println(tw);

        tw.displayDetails();
        fw.displayDetails();
    }
}
