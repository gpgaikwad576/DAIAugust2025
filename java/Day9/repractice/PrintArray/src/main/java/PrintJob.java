public class PrintJob extends Thread {
    private Array arr;
    public PrintJob(Array arr){
        this.arr = arr;
    }
    public void run(){
        try{
            arr.printArray();
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
