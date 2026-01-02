package DessertTypes;

import DessertOps.Dessert;

public class Cookie extends Dessert {
    final double price = 200;

    public Cookie(String flavour) {
        super(flavour);
    }

    public double calcPrice(int quantity) {
        return quantity * this.price / 12;
    }
}