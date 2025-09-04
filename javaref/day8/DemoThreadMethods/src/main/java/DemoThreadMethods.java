public class DemoThreadMethods {
    public static void main(String[] args){
        Thread t = new Thread(new Thread2());
        t.setName("Thread2");
        t.start();

        System.out.println(t.isAlive());

        for(int i =0;i<30;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
            if(i==2) Thread.yield();
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }

        try{
            t.join(); //thread2 will wait for main to finish

        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(t.isAlive());


    }
}
