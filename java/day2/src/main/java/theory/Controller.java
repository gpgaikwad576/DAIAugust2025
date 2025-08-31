package theory;
import java.util.Scanner;
public class Controller{
    public static void main(String[] args){
        Curtain curtain1 =new Curtain();
        Curtain curtain2=new Curtain();
        Remote remote1 = new Remote();
        remote1.clickButton(curtain1);
        System.out.println("Status of first controller: "+curtain1.getStatus());
        remote1.clickButton(curtain2);
        System.out.println("Status of Second controller: "+curtain1.getStatus());

        remote1.clickButton(curtain1);
        System.out.println("Status of first controller, after clicking again: "+curtain1.getStatus());

}

}