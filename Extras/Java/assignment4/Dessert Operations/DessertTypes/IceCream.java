package DessertTypes;

import DessertOps.Dessert;

public class IceCream extends Dessert {
    final double price = 500;

    public IceCream(String flavour) {
        super(flavour);
    }

    public double calcPrice(int quantity) {
        return quantity * this.price;
    }


}