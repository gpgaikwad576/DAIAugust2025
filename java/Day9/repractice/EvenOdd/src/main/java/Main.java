public class Main {
    public static void main(String[] args) {
        EvenOdd eo = new EvenOdd();

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                eo.printOdd();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                eo.printEven();
            }
        });

        t.setName("Thread1");
        t2.setName("Thread2");
        t.start();
        t2.start();
    }
}
