package DessertOpsMain;

public abstract class Dessert {
    String flavour;

    public Dessert(String flavour){
        this.flavour = flavour;
    }

    public abstract double calcPrice(int quantity);
}
