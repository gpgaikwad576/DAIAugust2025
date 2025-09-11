
import java.time.YearMonth;
import java.util.Map;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stock<Toy> stk = new Stock<>();
        Toy t1 = new Toy(123,"khilona",1234.00,"funnatics",12,20,YearMonth.of(2023,12));
        Toy t2 = new Toy(124,"Mhilona",34.00,"Education",18,25,YearMonth.of(2022,12));
        Toy t3 = new Toy(125,"Shilona",234.00,"sports",5,20,YearMonth.of(2023,10));
        Toy t4 = new Toy(126,"Dhilona",123.00,"sports",5,50,YearMonth.of(2025,1));
        stk.addItem(t1);
        stk.addItem(t2);
        stk.addItem(t3);
        stk.addItem(t4);


//    1. List the Stock
//    2. Filter the stock by category [e.g. Educational / Battery operated etc]
//    3. List Toys by price range (e.g. between 500 to 1000)
//    4. Sort the toys by price- category wise
//    5. Make the list of old stock [older than 1 year]
//    6. Make a group of toys as per their category, count them
//    7. Display the most expensive/least expensive toy in given category
//    8. Print total no of toys in stock for each age grp
































////////////////////////////////////////////////////////////////////////////////////////////////////////


//        1. List the Stock
        System.out.println("List the Stock");
        for(Toy toy: stk.listStock()){
            System.out.println(toy);
        }
        System.out.println();

//        2. Filter the stock by category [e.g. Educational / Battery operated etc]
        System.out.println("Filter the stock by category");
        for(Toy toy: stk.filterByCategory("sports")){
            System.out.println(toy);
        }
        System.out.println();

//        3. Search toy in the list by using binarySearch (with prodid as key)
        System.out.println("Search toy in the list by using binarySearch");
        System.out.println(stk.searchList(124));
        System.out.println();

//        4. List Toys by price range
        System.out.println("List Toys by price range");
        for(Toy toy: stk.filterByPriceRange(122,300)){
            System.out.println(toy);
        }
        System.out.println();

//        5. List toys for a specific age
        System.out.println("List toys for a specific age");
        for(Toy toy: stk.filterByAge(12)){
            System.out.println(toy);
        }
        System.out.println();

//        6. Sort the toys by price, name, prodid
        System.out.println("Sort the toys by price, name, prodid");
        for(Toy toy: stk.sortToys()){
            System.out.println(toy);
        }
        System.out.println();

//        7. Make the list of old stock [older than 1 year]
        System.out.println("Make the list of old stock [older than 1 year]");
        for(Toy toy: stk.filterByPurchase(12)){
            System.out.println(toy);
        }
        System.out.println();

//        8. Make a group of toys as per their category
        System.out.println("Make a group of toys as per their category");
        for(Map.Entry<String,List<Toy>> entry: stk.groupedByCategory().entrySet()){
            System.out.println(entry.getKey()+":");
            List<Toy> toys = entry.getValue();
            for(Toy t: toys){
                System.out.println(t);
            }
            System.out.println();
        }




    }
}
