package selvan.ponniyin.Interview;

public class BinarySearch {

    public static void main(String[] args) {


        System.out.println(binarySearch(new int[]{1,2,3,4,5,6,7,8,9,10},0,10,5));
    }


    public static int binarySearch(int[] nums,int start,int end,int target){

        if(end < start) return -1;

        int mid = (start +end )/2;

        if(nums[mid]==target){
            return mid;
        }else if(nums[mid] > target){
            return binarySearch(nums,start,mid,target);
        }else {
            return binarySearch(nums,mid+1,end,target);
        }
    }



}
