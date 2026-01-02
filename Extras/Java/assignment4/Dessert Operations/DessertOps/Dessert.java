package DessertOps;

public abstract class Dessert {
    protected String flavour;

    public Dessert(String flavour) {
        this.flavour = flavour;
    }

    protected abstract double calcPrice(int quantity);
}
