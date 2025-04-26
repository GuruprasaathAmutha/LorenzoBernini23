package selvan.ponniyin.DSAprac.Sort;

import java.util.Arrays;

public class MergeSort {

    public void MergeSortMethod(int[] nums){

        int len=nums.length;

        if(len<2) return;

        int mid= len/2;
        int[] left = new int[mid];
        int[] right = new int[len-mid];

        for(int i=0;i<mid;i++){
            left[i]=nums[i];
        }
        for(int j=mid;j<=len-1;j++){
            right[j-mid]=nums[j];
        }
        MergeSortMethod(left);
        MergeSortMethod(right);

        compareAndJoin(left,right,nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void compareAndJoin(int[] left,int[] right,int[] nums){
        int i=0 ,j=0 , k=0;
        while(i < left.length && j < right.length){
            if(left[i] <=  right[j]){
                nums[k++]=left[i++];
            }else{
                nums[k++]=right[j++];
            }
        }

        while(i<left.length){
            nums[k++]=left[i++];
        }
        while(j<right.length){
            nums[k++]=right[j++];
        }
    }

}
