package DessertTypes;

import DessertOps.Dessert;

public class Candy extends Dessert {
    final double price = 100;

    public Candy(String flavour) {
        super(flavour);
    }

    public double calcPrice(int quantity) {
        return quantity * this.price / 1000;
    }


}
