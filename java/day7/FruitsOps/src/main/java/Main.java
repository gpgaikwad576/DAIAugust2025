import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<String> arr=List.of("Mango", "orange", "Grapes", "apple", "Banana", "strawberry", "Watermelon","APPLE","PINAPPLE");
        FruitsOps f1=new FruitsOps(arr);

        System.out.println("List of fruits to Uppercase:");
        f1.toUpper().forEach(System.out::println);

        System.out.println("");
        System.out.println("List of to Lowercase:");
        f1.toLower().forEach(System.out::println);

        System.out.println("");
        System.out.println("List of fruits Length less than n and ascending order:");
        f1.filterBynAsc(95).forEach(System.out::println);

        System.out.println("");
        System.out.println("List of fruits Length less than n and descending order:");
        f1.filterBynDsc(95).forEach(System.out::println);

        System.out.println("");
        System.out.println("Filter by uppernames: ");
        f1.filterByUpper().forEach(System.out::println);

        System.out.println("");
        System.out.println("List of fruits with length equal to  6 and descending order");
        f1.filterBySize().forEach(System.out::println);

        System.out.println("");
        System.out.println("Sort by Length: ");
        f1.sortByLength().forEach(System.out::println);
    }
}
