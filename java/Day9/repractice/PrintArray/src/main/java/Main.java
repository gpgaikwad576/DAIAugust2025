
public class Main {
    public static void main(String[] args) {
        Array arr = new Array();
        Thread t = new PrintJob(arr);
        Thread t2 = new PrintJob(arr);
        t.setName("Thread1");
        t2.setName("Thread2");
        t.start();
        t2.start();

    }
}