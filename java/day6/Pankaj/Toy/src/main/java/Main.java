import java.time.YearMonth;
public class Main {
    public static void main(String[] args) {
        Stock<Toy> stk = new Stock<>();
        Toy t1 = new Toy(123,"khilona",1234,"funnatics",12,20,YearMonth.of(2023,12));
        Toy t2 = new Toy(124,"Mhilona",34,"Education",18,25,YearMonth.of(2022,12));
        Toy t3 = new Toy(125,"Shilona",234,"sports",5,20,YearMonth.of(2023,10));
        Toy t4 = new Toy(126,"Dhilona",123,"sports",5,50,YearMonth.of(2025,1));
        stk.addItem(t1);
        stk.addItem(t2);
        stk.addItem(t3);
        stk.addItem(t4);
        System.out.println(stk.listStock());
        System.out.println(stk.filterByPurchase(12));
        System.out.println(stk.groupedByCategory());
    }
}
