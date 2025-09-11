import java.time.YearMonth;

public class Toy {
    private long productid;
    private String name;
    private double price;
    private String category;
    private int lowAge;
    private int highAge;
    private YearMonth purchase;

    public Toy(long productid, String name, double price, String category, int lowAge, int highAge, YearMonth purchase){
        this.productid = productid;
        this.name = name;
        this.price = price;
        this.category = category;
        this.lowAge = lowAge;
        this.highAge = highAge;
        this.purchase = purchase;
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
    public int[] getAge(){
        int[] ageRange = {this.lowAge,this.highAge};
        return ageRange;
    }

    public void setAge(int lowAge,int highAge){
        this.lowAge = lowAge;
        this.highAge = highAge;
    }

    public void setPurchase(YearMonth purchase){
        this.purchase = purchase;
    }

    public YearMonth getPurchase(){
        return purchase;
    }

    @Override
    public String toString() {
        return "Id: "+productid+" name: "+name+" price: "+price+" category: "+category+" lowAge: "+lowAge+" highAge: "+highAge;
    }
}
