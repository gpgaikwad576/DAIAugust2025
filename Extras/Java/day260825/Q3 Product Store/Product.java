package theory;

public class Product{
    int id;
    String name;
    int price;

    public Product(int id,String name,int price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String toString(){
        return this.name+" "+this.price;
    }

}