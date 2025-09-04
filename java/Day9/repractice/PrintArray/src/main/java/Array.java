public class Array {
    private int[] arr;
    public Array(){
        this.arr = new int[]{10,20,30,40};
    }

    public synchronized void printArray() throws InterruptedException{
        for(int i=0;i<arr.length;i++){
            System.out.println(Thread.currentThread().getName()+": "+arr[i]);
        }
    }
}
