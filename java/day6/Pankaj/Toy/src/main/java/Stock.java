import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.YearMonth;

public class Stock<T extends Toy> {
    List<T> arr;
    public Stock(){
        arr = new ArrayList<>();
    }

    public void addItem(T item){
        arr.add(item);
    }
    public List<T> listStock(){
        return arr;
    }

    public List<T> filterByCategory(String category){
        List<T> filteredList = new ArrayList<>();
        for(T item: arr){
            if(item.getCategory().equals(category)) filteredList.add(item);
        }
        return filteredList;
    }

    public List<T> filterByPriceRange(double lowPrice,double highPrice){
        List<T> filteredList = new ArrayList<>();
        for(T item: arr){
            if(item.getPrice() > lowPrice && item.getPrice() < highPrice){
                filteredList.add(item);
            }
        }
        return filteredList;
    }

    public List<T> filterByAge(int age){
        List<T> filteredList = new ArrayList<T>();
        for(int i =0;i<arr.size();i++){
            T item = arr.get(i);
            if(age>item.getAge()[0] && age< item.getAge()[0]){
                filteredList.add(item);
            }
        }
        return filteredList;
    }

    public List<T> filterByPurchase(int stay){
        List<T> filteredList = new ArrayList<>();
        System.out.println(YearMonth.now());
        for(int i =0;i<arr.size();i++){
            T item = arr.get(i);
            if(ChronoUnit.MONTHS.between(item.getPurchase(),YearMonth.now())>stay) filteredList.add(item);
        }
        return filteredList;
    }

    public Map<String,List<T>> groupedByCategory(){
        Map<String,List<T>> filteredList = new HashMap<>();
        for(T item: arr){
            if(filteredList.containsKey(item.getCategory())){
                filteredList.get(item.getCategory()).add(item);
            }
            else{
                filteredList.put(item.getCategory(),new ArrayList<T>(Arrays.aslist(item)));
            }
        }
        return filteredList;
    }

    public T searchList(int productid){

        long[] productIdArr = new int[]{};
        for(int i =0;i<arr.size();i++){
            productIdArr[i] = arr.get(i).getProductId();
        }
        long low = productIdArr[0], high = productIdArr[arr.size()-1];
        while(low<=high){
            long mid = (low+high)/2;
            if(productid == mid){
                for(T item:arr){
                    if(item.getProductId() == mid) return item;
                }
            }
            else if(productid < mid){
                high = mid-1;
            }
        }
    }



}
