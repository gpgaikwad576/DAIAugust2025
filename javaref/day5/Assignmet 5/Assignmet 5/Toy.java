package day5;

import java.util.Arrays;

public class Toy implements Comparable<Toy>{

    private int productId;
    private String name;
    private float price;
    private String category;
    private int[] age;
    private int purchaseYear;

    public Toy(int productId, String name, float price, String category, int[] age, int purchaseYear) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.category = category;
        this.age = age;
        this.purchaseYear = purchaseYear;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int[] getAge() {
        return age;
    }

    public void setAge(int[] age) {
        this.age = age;
    }

    public int getPurchaseYear() {
        return purchaseYear;
    }

    public void setPurchaseYear(int purchaseYear) {
        this.purchaseYear = purchaseYear;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\''+
                '}' ;
    }

    @Override
    public int compareTo(Toy toy) {
        if(this.getProductId() > toy.getProductId()){
            return 1;
        } else if (this.getProductId() < toy.getProductId()) {
            return -1;
        }
        return 0;

    }
}
