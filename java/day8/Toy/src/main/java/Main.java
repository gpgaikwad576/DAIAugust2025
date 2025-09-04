package ToyProblem;

// import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

public class Main{
    public static void main(String [] args){

        Toy t1=new Toy(1, "ball", 100, "Fun", 10, 5);
        Toy t2=new Toy(2, "robot", 500, "Battery", 15, 1);
        Toy t3=new Toy(3, "bat", 100, "Fun", 10, 3);
        Toy t4=new Toy(4, "car", 600, "Fun", 13, 4);
        Toy t5=new Toy(5, "DIY kit", 100, "Educational", 20, 1);
        Toy t6=new Toy(6, "abacus", 200, "Educational", 15, 10);
        Toy t7=new Toy(7, "helicopter", 2000, "Battery", 12, 12);
        
        List<Toy> arr= List.of(t1,t2,t3,t4,t5,t6,t7);
        
        System.out.println("---------------List Stocks----------------");
        arr.stream().forEach(System.out::println);

        System.out.println(" ");
        System.out.println("---------------Filter By Category----------------");
        arr.stream().filter(p -> p.getCategory().equals("Fun")).forEach(System.out::println);

        System.out.println(" ");
        System.out.println("---------------Filter By Price Range ----------------");
        arr.stream().filter(p-> p.getPrice()>500 && p.getPrice()<1000).forEach(System.out::println);

        System.out.println(" ");
        System.out.println("---------------Toys older Than 1 year----------------");
        arr.stream().filter(p->p.getAge()>1).forEach(System.out::println);
        
        System.out.println(" ");
        System.out.println("---------------Group By Category ----------------");
        arr.stream().collect(Collectors.groupingBy(p->p.getCategory())).forEach((k,v)-> System.out.println(k+": "+v+"Count: "+ v.size()));

        System.out.println(" ");
        System.out.println("---------------Most Expensive----------------");
        Optional<Toy> max=arr.stream().max(Comparator.comparingDouble(p->p.getPrice()));
        System.out.println(max);

        System.out.println(" ");
        System.out.println("---------------Least Expensive----------------");
        Optional<Toy> min=arr.stream().min(Comparator.comparingDouble(p->p.getPrice()));
        System.out.println(min);

        System.out.println(" ");
        System.out.println("---------------Group by age and Count ----------------");
        arr.stream().collect(Collectors.groupingBy(p->p.getAge())).forEach((k,v)->System.out.println("Age "+k+": "+v.size()));

        


    }

}
