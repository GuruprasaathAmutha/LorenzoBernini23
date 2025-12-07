package selvan.ponniyin.L75;

import java.util.Arrays;

public class FinalRun {

    public static void main(String[] args) {
        System.out.println(minEatingSpeed(new int[]{805306368,805306368,805306368},1000000000));
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int left =1;
        int right = Arrays.stream(piles).max().orElse(-1);
        int result = Arrays.stream(piles).max().orElse(-1);

        while(left<=right){
            int k = (left+right)/2;
            int currentTime = getEatingTime(piles,k);
            if(currentTime<=h){
                result = Math.min(result,k);
                right=k-1;
            }else{
                left = k+1;
            }
        }
        return result;
    }




    public static int getEatingTime(int[]piles,int k){

        int time =0;
        for(int i : piles){
            time += (int) Math.ceil (  (double) i / k);
        }
        return time;
    }
}
