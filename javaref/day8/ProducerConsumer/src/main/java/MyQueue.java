
import java.util.ArrayDeque;
import java.util.Queue;

public class MyQueue {

    Queue<String> queue;
    boolean hasvalue;

    public MyQueue()
    {
        queue = new ArrayDeque<>();
    }

    public synchronized void setValue(String value)
    {
        if(hasvalue)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        queue.add(value);
        notifyAll();
        hasvalue = true;
        System.out.println("Set value " + value);
    }

    public synchronized void getValue()
    {
        if(!hasvalue)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        String value = queue.poll();
        System.out.println("Got value " + value);
        notifyAll();
        hasvalue=false;
    }
}