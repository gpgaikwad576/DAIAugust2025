package DessertOpsMain;

public class Cookie extends Dessert{
    double price = 200;
    public Cookie(String flavour){
        super(flavour);
    }
    public double  calcPrice(int quantity){
        return quantity * this.price/12;
    }
}