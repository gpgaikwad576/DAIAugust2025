package theory;

public class BinarySearch {
    public static void main(String args[]){
        int [] arr={1,2,3,4,5,6,7,8};
        int key= 1;
        boolean found=false;
        int i=0,j=arr.length-1;
        while(i<=j){
            int mid = (i + j)/2;
            if (arr[mid]==key){
                System.out.println("Number  Found ");
                found =true;
                break;
            }
            else if (arr[mid]<key) {
                i=mid+1;
            }
            else {
                j=mid-1;
            }
        }
        if(!found) System.out.println("Number Not Found ");

    }
}
