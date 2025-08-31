package theory;
public class Curtain{
    private boolean isOpen=false;
    public void changeStatus(){
        isOpen=!isOpen;
    }
    public boolean getStatus(){
        return isOpen;
    }
}