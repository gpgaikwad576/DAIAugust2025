package DessertOps;

import java.util.ArrayList;
import java.util.List;

import DessertTypes.Candy;
import DessertTypes.Cookie;
import DessertTypes.IceCream;
import utility.Pair;

class Cart {
    List<Pair> chosenDesserts;

    Cart() {
        chosenDesserts = new ArrayList<>();
    }

    void addToCart(Dessert dessert, int quantity) {
        Pair dessertQuant = new Pair(dessert, quantity);
        chosenDesserts.add(dessertQuant);
    }

    double generateBill() {
        double totalBill = 0;
        for (Pair pair : this.chosenDesserts) {
            if (pair.dessert instanceof Candy) {
                Candy candy = (Candy) pair.dessert;
                totalBill += candy.calcPrice(pair.quantity);
            } else if (pair.dessert instanceof Cookie) {
                Cookie cookie = (Cookie) pair.dessert;
                totalBill += cookie.calcPrice(pair.quantity);
            } else {
                IceCream iceCream = (IceCream) pair.dessert;
                totalBill += iceCream.calcPrice(pair.quantity);
            }
        }
        return totalBill;
    }

    int displayTotalCount() {
        int totalItems = 0;
        for (Pair pair : this.chosenDesserts) {
            totalItems += pair.quantity;
        }
        return totalItems;
    }


}
