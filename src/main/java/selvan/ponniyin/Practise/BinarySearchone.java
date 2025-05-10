package selvan.ponniyin.Practise;

public class BinarySearchone {

    public static void main(String[] args) {
//        System.out.println(search(new int[]{11,22,33,1231,1241241,8888888},0,5,12412));

        BinaryTree bt = new BinaryTree(8);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(1);
//        bt.PreOrder();
//bt.InOrder();
//bt.PostOrder();
    }

    static int search(int[] nums,int start,int end,int target){
        int mid = (start+end)/2;
        if(start>end) return -1;

        if(nums[mid]==target){
            return mid;
        } else if (nums[mid]<target) {
            return search(nums,mid+1,end,target);
        }else {
            return search(nums,start,mid-1,target);
        }
    }



}
