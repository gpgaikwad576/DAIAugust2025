public class Policy {
    TwoWheeler w;
    FourWheeler f;
    public double display (Vehicle v){
        if(v instanceof TwoWheeler){
            w=(TwoWheeler) v;
            return w.calculateInsurance();
        }
        else{
            f=(FourWheeler) v;
            return f.calculateInsurance();
        }
    }
}
