import java.time.LocalDate;
import java.util.Locale;

public class FoodItem {

    private int food_ID ;
    private static int counter = 10;
    String name;
    Category cat;
    private int price;
    private int stock;
    private LocalDate addedDate;
    private LocalDate lastOrderedDate = null;
    private int discountp;
//    private LocalDate lastSellDate;


    public FoodItem(String name, String cat, int price, int stock, LocalDate addedDate,int discountp ) {
        this.name = name;
        this.cat = Category.valueOf(cat);
        this.price = price;
        this.stock = stock;
        this.addedDate = addedDate;
        this.discountp = discountp;
        counter++;
        food_ID = counter;

    }


    public int getFood_ID() {
        return food_ID;
    }

    public void setStock(int qty) {
        this.stock = qty;
    }

    public void setLastOrderedDate(LocalDate lastOrderedDate) {
        this.lastOrderedDate = lastOrderedDate;
    }

    public int getStock() {
        return stock;
    }

    public LocalDate getLastOrderedDate() {
        return lastOrderedDate;
    }

    public void setDiscountp(int discountp) {
        this.discountp = discountp;
    }

    public LocalDate getAddedDate() {
        return addedDate;
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "food_ID=" + food_ID +
                ", name='" + name + '\'' +
                ", cat=" + cat +
                ", price=" + price +
                ", stock=" + stock +
                ", addedDate=" + addedDate +
                ", lastOrderedDate=" + lastOrderedDate +
                ", discountp=" + discountp +
                '}';
    }
}
