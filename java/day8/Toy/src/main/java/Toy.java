package ToyProblem;

public class Toy {
    private int prodid;
    private String name;
    private double price;
    private String category;
    private int age;
    private int year;

    public Toy(int id,String name,double price,String category,int age,int year){
        this.prodid=id;
        this.name=name;
        this.price=price;
        this.category=category;
        this.age=age;
        this.year=year;
    }

    public double getPrice(){return this.price;}
    public String getName(){return this.name;}
    public int getAge(){return this.age;}
    public int getYear(){return this.year;}
    public String getCategory(){return this.category;}
    public int getId(){return this.prodid;}

    @Override
    public String toString(){
        return "Toy-> "+"productid:"+this.prodid+" Name:"+this.name+" Price:"+this.price+" Category:"+this.category+" age:"+this.age+" year:"+this.year;
    }

}
