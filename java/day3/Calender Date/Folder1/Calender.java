package Folder1;
import Folder2.Date;
public class Calender {
    Date date;
    Calender(int dd, int mm, int yy){
        this.date = new Date(dd,mm,yy);
    }
    public static void main(String args[]){
        Calender cal = new Calender(28,8,25);
        System.out.println("Date imported to Calender");
    }
}
