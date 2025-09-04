public class Main {
    public static void main(String[] args) {
        Account acc = new Account(12345,"sarlabai",35000.00);
        Thread t = new Thread(new Runnable(){
                @Override
                public void run(){
                    for(int i=0;i<6;i++){
                        acc.withdraw(6000);
//                        try{
//                            Thread.sleep(1000);
//                        }catch(InterruptedException e){
//                            e.printStackTrace();
//                        }
                    }
                }
        });

        Thread t2 = new Thread(new Runnable(){

            @Override
            public void run(){
                for(int i=0;i<6;i++){
                    acc.deposit(5000);
//                    try{
//                        Thread.sleep(1000);
//                    }catch(InterruptedException e){
//                        e.printStackTrace();
//                    }
                }
            }
        });
        t.start();
        t2.start();
    }
}
