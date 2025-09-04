public class Main {
    public static void main(String [] args){
        Account a1=new Account("as",123,25000.00);

        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<5;i++){
                    a1.withdraw(6000);
//                    try {
//                        Thread.sleep(5000);
//                    }
//                    catch (InterruptedException e){
//                        System.out.println("vv");
//                    }
                }
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<5;i++){
                    a1.deposit(5000);
                }
            }
        });

        t1.start();
        t2.start();



    }
}
