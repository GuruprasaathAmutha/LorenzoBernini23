package selvan.Mountatins.MarkOne;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import java.util.*;

public class practiseOne {

    public static void main(String[] args) {
        threeSum(new int[]{-1,0,1,2,-1,-4});
    }



    static List<List<Integer>> threeSum (int[] nums){

        Arrays.sort(nums);

        Set<Integer> temp = new HashSet<>();

        List< List <Integer>> res = new ArrayList<>();

        int i=0;
        int j =i+1;
        int k =nums.length -1;

        int i_prev=0;
        int k_prev=0;

        while(i<nums.length && i<j && i<k ){
            if(i_prev != nums[i]){
                i_prev = nums[i];
                while(j<k){
                    if(k_prev != nums[k]){
                        k_prev = nums[k];
                        if(nums[i]+nums[j]+nums[k]==0){
                            List<Integer> l = new ArrayList<>();
                            l.add(nums[i]);
                            l.add(nums[j]);
                            l.add(nums[k]);
                            res.add(l);
                        }else if (nums[i]+nums[j]+nums[k]<0){
                            j++;
                        }else{
                            k--;
                        }
                    }else{
                        k--;
                    }
                }
            }
            i++;
        }
        return res;
    }



    public int threeSumClosest(int[] nums, int target) {
        int sum = Arrays.stream(nums).sum();
        Arrays.sort(nums);

        for(int i : nums){

        }

        return sum;
    }
}
