public class DemoThreads {
    public static void main(String[] args){
        Thread t1 = new Thread1();
        t1.setName("mythread1");
        t1.start();
        Thread t2 = new Thread(new Thread2());
        t2.setName("myThread2");
        t2.start();

        for(int i=0;i<20;i++){
            System.out.println("Demo: " +Thread.currentThread().getName()+":"+i);
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
