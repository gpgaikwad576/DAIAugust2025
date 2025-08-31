package utility;

public class CustomException extends Exception{
    private String detail;
    public CustomException(String detail){
        this.detail = detail;
    }

    public String toString(){
        return "Custom Exception: "+this.detail;
    }
}
