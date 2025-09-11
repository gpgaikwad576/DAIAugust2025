import java.time.temporal.ChronoUnit;
import java.time.YearMonth;
import java.time.YearMonth;
import java.util.Map;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Stock<T extends Toy> {
    List<T> items;
    public Stock(){
        items = new ArrayList<>();
    }

    public void addItem(T item){
        items.add(item);
    }

    //    1. List the Stock
    public List<T> listStock(){
        return items;
    }

//    2. Filter the stock by category [e.g. Educational / Battery operated etc]
    public List<T> filterByCategory2(String cat){
        return items.stream().filter((toy)->toy.getCategory().equals(cat)).collect(Collectors.toList());
    }
//    3. List Toys by price range (e.g. between 500 to 1000)
    public List<T> filterByPrice2(double lowPrice, double highPrice){
        return items.stream().filter((toy)->toy.getPrice()>lowPrice && toy.getPrice()<=highPrice).collect(Collectors.toList());
    }
//    4. Sort the toys by price- category wise
    public List<T> sortByPriceCat2(){
        return items.stream().sorted(Comparator.comparing(Toy::getCategory,Comparator.reverseOrder())
                .thenComparing(Toy::getPrice,Comparator.reverseOrder())).collect(Collectors.toList());
    }
//    5. Make the list of old stock [older than 1 year]
    public List<T> filterByPurchase2(int stay){
        return items.stream().filter((toy)->ChronoUnit.MONTHS.between(toy.getPurchase(),YearMonth.now())>stay).collect(Collectors.toList());
    }
//    6. Make a group of toys as per their category, count them
    public Map<String,Long> groupByCatCount(){
        return items.stream().collect(Collectors.groupingBy(Toy::getCategory,
                Collectors.counting()));
    }

//    7. Display the most expensive/least expensive toy in given category
    public T getMostExpToy(String category){
        return items.stream().filter((toy)->toy.getCategory().equals(category)).col
    }
//    8. Print total no of toys in stock for each age grp


























    public List<T> filterByCategory(String category){
        List<T> filteredList = new ArrayList<>();
        for(T item: items){
            if(item.getCategory().equals(category)) filteredList.add(item);
        }
        return filteredList;
    }

    public List<T> filterByPriceRange(double lowPrice,double highPrice){
        List<T> filteredList = new ArrayList<>();
        for(T item: items){
            if(item.getPrice() > lowPrice && item.getPrice() < highPrice){
                filteredList.add(item);
            }
        }
        return filteredList;
    }

    public List<T> filterByAge(int age){
        List<T> filteredList = new ArrayList<T>();
        for(int i =0;i<items.size();i++){
            T item = items.get(i);
            if(age>item.getAge()[0] && age< item.getAge()[1]){
                filteredList.add(item);
            }
        }
        return filteredList;
    }

    public List<T> filterByPurchase(int stay){
        List<T> filteredList = new ArrayList<>();
        for(int i =0;i<items.size();i++){
            T item = items.get(i);
            if(ChronoUnit.MONTHS.between(item.getPurchase(),YearMonth.now())>stay) filteredList.add(item);
        }
        return filteredList;
    }

    public Map<String,List<T>> groupedByCategory(){
        Map<String,List<T>> filteredList = new HashMap<>();
        for(T item: items){
            if(filteredList.containsKey(item.getCategory())){
                filteredList.get(item.getCategory()).add(item);
            }
            else{
                filteredList.put(item.getCategory(),new ArrayList<T>(Arrays.asList(item)));
            }
        }
        return filteredList;
    }

    public T searchList(int productid){
        Comparator<Toy> byProductId = Comparator.comparing(Toy::getProductId);
        items.sort(byProductId);
        int index = Collections.binarySearch(items,new Toy(productid,null,0,null,0,0,null),byProductId);
        return items.get(index);

    }

    public List<T> sortToys(){
        Comparator<Toy> byPriceNamePId = Comparator.comparing(Toy::getPrice)
                .thenComparing(Toy::getName)
                .thenComparing(Toy::getProductId);
        items.sort(byPriceNamePId);
        return items;
    }






}
