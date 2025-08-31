package utility;

public class Response {
    public boolean isSuccessful=false;
    public String remark="";


    public Response(){  //constructor overloading
    }

    public Response(boolean iSuccessful,String remark){
        this.isSuccessful = iSuccessful;
        this.remark = remark;
    }


}
