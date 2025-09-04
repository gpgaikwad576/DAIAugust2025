public class Thread1 extends Thread{
    public void run(){
        for(int i=0;i<20;i++){
            System.out.println(Thread.currentThread().getName() + ":"+i);
            try{
                Thread.sleep(0);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}