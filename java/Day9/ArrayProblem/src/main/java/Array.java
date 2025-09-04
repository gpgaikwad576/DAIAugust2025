public class Array {
    int [] arr={10,20,30,40};

    public synchronized void print(){
        for(int i=0;i<arr.length;i++){
            System.out.println(Thread.currentThread().getName()+" "+ arr[i]);
            try{
                Thread.sleep(2000);
            }
            catch (InterruptedException e){
                System.out.println(" ");
            }
            notifyAll();
        }
//            try {
//                System.out.println(Thread.currentThread().getName()+" "+arr[i]);
//                Thread.sleep(2000);
//                notifyAll();
//            }
//            catch (InterruptedException e){
//                System.out.println(" ");
//            }
        }
    }

