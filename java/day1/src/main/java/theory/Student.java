package theory;


public class Student {
    String name;
    int rollNo;
    static int incRN=1;
    Student(){
    }
    Student(String name){
        this.name = name;
        this.rollNo = incRN++ ;
    }

    public int getRollNo(){
        return this.rollNo;
    }
    public void setRollNo(int RollNo){
        this.rollNo =RollNo;
    }
    public String toString(){
        return "Name: "+this.name +" RollNo: "+this.rollNo;
    }

}
