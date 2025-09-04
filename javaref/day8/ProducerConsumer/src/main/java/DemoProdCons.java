public class DemoProdCons {

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        Thread prod = new Thread(new Runnable() {

            @Override
            public void run() {
                for(int i=0; i<10; i++)
                {
                    queue.setValue("Data " + i);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }

            }
        });

        Thread cons = new Thread(new Runnable() {

            @Override
            public void run() {
                for(int i=0; i<10; i++)
                {
                    queue.getValue();
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        });

        prod.start();
        cons.start();
    }

}