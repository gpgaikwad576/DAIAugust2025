public class EvenOdd {
    int num=1;
    final int maxNum=20;
public synchronized void printEven(){
    while(num <= maxNum){
        if(num%2 != 0){
            try{
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName()+": "+num);
        num++;
        notifyAll();
    }
}

public synchronized void printOdd(){
    while(num <= maxNum){
        if(num%2 ==0){
            try{
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName()+": "+num);
        num++;
        notifyAll();
    }
}


}
