public class Toy {
    private long productid;
    private String name;
    private double price;
    private String category;
    private int age;
    private int purchaseyear;

    public Toy(long productid, String name, double Price, String category, int age, int purchaseyear){
        this.productid = productid;
        this.name = name;
        this.price = price;
        this.category = category;
        this.age = age;
        this.purchaseyear = purchaseyear;
    }

    public long getProductId(){
        return productid;
    }

    public void setProductid(long productid){
        this.productid = productid;
    }

    public String getName(){
        return name;
    }

    public void setName(){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getCategory(){
        return category;
    }

    public void setCatgeory(String category){
        this.category = category;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public void setPurchaseYear(int purchaseyear){
        this.purchaseyear = purchaseyear;
    }


}
