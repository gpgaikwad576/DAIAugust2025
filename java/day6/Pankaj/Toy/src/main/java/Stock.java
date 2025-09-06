import java.util.*;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.YearMonth;

public class Stock<T extends Toy> {
    List<T> items;
    public Stock(){
        items = new ArrayList<>();
    }

    public void addItem(T item){
        items.add(item);
    }
    public List<T> listStock(){
        return items;
    }

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
