import java.util.ArrayList;
import java.util.List;
public class ToyManager {
    Stock stk;
    
    public ToyManager(){
        stk=new Stock();
    }

    public void addtoy(Toy t){
        stk.toylist.add(t);
    }


    
}
