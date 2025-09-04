import java.util.List;
import java.util.ArrayList;
public class Stock<T> {
    List<T> arr;
    public Stock(){
        toys = new ArrayList<>();
    }

    public void addToy(T t){
        arr.add(t);
    }
    public List<T> listStock(){
        return arr;
    }

    public List<T> filterByCategory(){
        return ;
    }
}
