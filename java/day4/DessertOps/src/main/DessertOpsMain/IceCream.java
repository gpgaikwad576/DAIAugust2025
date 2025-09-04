package DessertOpsMain;

public class IceCream extends Dessert{
    double price = 500;
    public IceCream(String flavour){
        super(flavour);
    }
    public double  calcPrice(int quantity){
        return quantity * this.price;
    }


}