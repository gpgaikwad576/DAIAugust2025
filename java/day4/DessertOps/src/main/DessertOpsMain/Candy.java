package DessertOpsMain;

public class Candy extends Dessert{
    double price = 100;

    public Candy(String flavour){
        super(flavour);
    }
    public double calcPrice(int quantity){
        return quantity * this.price/1000;
    }


}
