package theory;

public class Sorting {

    public static void main(String[] args){
        int[] arr={4,5,1,1,5,6,7,4};   //bubble sort
        int arrlen = arr.length,temp;
        int i,j;
        for(i=0;i<arrlen;i++){
            for(j=0;j<arrlen-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }



}
