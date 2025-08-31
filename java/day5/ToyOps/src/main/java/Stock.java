import javax.print.attribute.IntegerSyntax;
import java.awt.geom.QuadCurve2D;
import java.util.*;

public class Stock<T> {
    List<Toy> toylist;

    public Stock() {
        toylist = new ArrayList<>();
    }

    public void addtoy(Toy t) {
        toylist.add(t);
    }

    public void liststock() {
        for (Toy t : toylist) {
            t.toString();
        }
    }

    public List<Map.Entry<String, Double>> filterbystock(String ct) {
        List<Map.Entry<String, Double>> filteredStock = new ArrayList<>();
        for (Toy t : toylist) {
            if (t.getcategory().equals(ct)) {
                filteredStock.add(new AbstractMap.SimpleEntry<>(t.getcategory(), t.getprice()));
            }
        }
        return filteredStock;
    }

    public String filterbyid(int id) {
        Collections.sort(toylist, Comparator.comparingLong(t -> t.getid()));
        Toy key = new Toy(id, null, null, 0.0, 0, 0);
        int index = Collections.binarySearch(
                toylist,
                key,
                Comparator.comparingLong(t -> t.getid())
        );

        if (index >= 0) {
            return toylist.get(index).toString();
        } else {
            return "Toy with ID " + id + " not found.";
        }

    }

    public List<Map.Entry<String, Double>> filterbyprice(int x, int y) {
        List<Map.Entry<String, Double>> filteredbyprice = new ArrayList<>();
        for (Toy t : toylist) {
            if (t.getprice() < y && t.getprice() > x) {
                filteredbyprice.add(new AbstractMap.SimpleEntry<>(t.getname(), t.getprice()));
            }
        }

        // Sort by price (ascending)
        filteredbyprice.sort(Comparator.comparing(Map.Entry::getValue));

        return filteredbyprice;
    }

    public List<Map.Entry<String, Integer>> filterbyage(int age) {
        List<Map.Entry<String, Integer>> filteredbyage=new ArrayList<>();
        for(Toy t : toylist){
            if(t.getage()<age){
                filteredbyage.add(new AbstractMap.SimpleEntry<>(t.getname(), t.getage()));
            }
        }
        return filteredbyage;

    }
    public List<Toy> sort() {
        toylist.sort(
                Comparator.comparingDouble(Toy::getprice)
                        .thenComparing(Toy::getname)
                        .thenComparingLong(Toy::getid)
        );
        return toylist;
    }

    public List<Long> filterbyyear(int year) {
        List<Long> filteredbyyear = new ArrayList<>();
        for (Toy t : toylist) {
            if (t.getyear() > year) {
                filteredbyyear.add(t.getid());
            }
        }

        // Sort the list
        Collections.sort(filteredbyyear);

        return filteredbyyear;
    }

//    public  List<Map.Entry<String, List<Long>>> groupbycategory(){
//        List<Map.Entry<String, List<Long>>> group=new ArrayList<>();
//
//    }
}








