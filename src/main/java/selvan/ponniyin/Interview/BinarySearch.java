package selvan.ponniyin.Interview;

public class BinarySearch {

    public static void main(String[] args) {


        System.out.println(binarySearch(new int[]{1,2,3,4,5,6,7,8,9,10},0,9,11));
    }


    public static int binarySearch(int[] arr, int start, int end ,int target){

        int mid = (start+end)/2;

        if(start>end){
            return -1;
        }

        if(arr[mid]==target){
            return mid;
        }else if(arr[mid] < target){
             return binarySearch(arr,mid+1,end,target);
        }else{
            return binarySearch(arr,start,mid-1,target);
        }
    }



}
