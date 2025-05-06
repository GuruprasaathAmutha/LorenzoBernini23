package selvan.ponniyin.DSAprac.Sort;


import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Rhaegal {
    public static void main(String[] args) {
//        System.out.println( Integer.sum(1, (int)  Math.pow(10,2)));
//[1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1]
//        int[] o = new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
//        ListNode one = new ListNode();
//        one = addNode(o, 0, one);
//        int[] t = new int[]{5, 6, 4};
//        ListNode two = new ListNode();
//        two = addNode(t, 0, two);
//        ListNode res = addTwoNumbers(one, two);
//        System.out.println("check");
//        System.out.println(BigInteger.valueOf(1).add(BigInteger.ONE.pow(30)));
//        BigInteger a = BigInteger.valueOf(1000000);
//        System.out.println(  a.divideAndRemainder(BigInteger.valueOf(10))[1]);
//        String s = "Guru prasaath";
////        String[] res = s.split(" ");
//        System.out.println(s.contains("a"));
//        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));
        System.out.println(longestConsecutive(new int[] {9,1,4,7,3,-1,0,5,8,-1,6}));
    }

    public static int longestConsecutive(int[] nums) {
        Set<Integer> res = new HashSet<>();
        for(int n : nums){
            res.add(n);
        }
        if(res.size()==1) return 1;
        int count=0;

        for(int i=0;i<res.size();i++){
            if((res.contains(nums[i]+1) || res.contains(nums[i]-1)) ){
                count++;
            }
        }

        return count;
    }


    public static  int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int prod=1;
        int suffix=1;
        for(int i=0;i<nums.length;i++){
            if(i==0){
                result[i] = 1;
            }else{
                result[i]=prod *nums[i-1];
                prod *= nums[i-1];
            }
        }

        for(int j=nums.length-1;j>=0;j--){
         if(j==nums.length-1){
             result[j]= result[j] *suffix;
         }else{
             result[j]= result[j] *  nums[j+1]*suffix;
             suffix *= nums[j+1];
         }
        }
        return result;
    }

    public static ListNode addNode(int[] data, int index, ListNode one) {
        while (index < data.length) {
            one = new ListNode(data[index]);
            one.next = addNode(data, ++index, one.next);
            break;
        }
        return one;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger one = BigInteger.valueOf(0), two = BigInteger.valueOf(0);
        int pwr = 0;
        ListNode result = new ListNode();

        while (l1 != null) {
            one = one.add(BigInteger.valueOf(  l1.val * (long) Math.pow(10, pwr++)   ));
            l1 = l1.next;
        }
        pwr = 0;
        while (l2 != null) {
            two = two.add(BigInteger.valueOf(l2.val * (long) Math.pow(10, pwr++)));
            l2 = l2.next;
        }
        BigInteger res = one.add(two);

        return add(res,result);
//        return null;/
    }


    static ListNode add (BigInteger res,ListNode result){
        while(res.compareTo(BigInteger.ZERO) != -1){
            BigInteger rem = res.divideAndRemainder(BigInteger.valueOf(10))[0];
            result = new ListNode(rem.intValue());
//            res = (res - (res%10))/10;
            res = res.subtract(rem).divide(BigInteger.valueOf(10));
            result.next = add(res,result.next);
            break;
        }
        return result;
    }
}
