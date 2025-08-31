package theory;

public class Student {
    String name;
    int rollNo;
    int[] marks;

    private static int rollCounter = 1;

    public Student(String name, int[] marks){
        this.name = name;
        this.rollNo = rollCounter++;
        this.marks = new int[marks.length];
        for(int i = 0; i < marks.length; i++){
            this.marks[i] = marks[i];
        }
    }

    public float calcAvg(){
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        return totalMarks / marks.length;
    }

    public float calcPercent(){
        return (calcAvg() / 100) * 100; // Assuming each subject is out of 100
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Average: " + calcAvg());
        System.out.println("Percentage: " + calcPercent() + "%");
    }

    public static void main(String[] args){
        int[] arr = {80, 90, 70, 60, 60, 78, 67, 56};
        Student student1 = new Student("Pankaj", arr);
        student1.display();
    }
}
