package day5;

import java.util.Comparator;

public class PriceComparator implements Comparator<Toy> {

    public int compare(Toy t1,Toy t2){
        return Float.compare(t1.getPrice(),t2.getPrice());
    }
}
