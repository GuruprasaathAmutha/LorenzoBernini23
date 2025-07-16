package selvan.ponniyin.FinalRevision;

import java.util.Arrays;

public class Revision {

    public static void main(String[] args) {

//
//
//        int a =10;
//        int b=20;
//
//        a= a^b;
//        b= a^b;
//        a=a^b;
//
//        System.out.println(a>>2);

//

        System.out.println(addDigits(0));


    }


    public static int addDigits(int num){
        int sum=0;
        while(num>0){
           sum += num%10;
           num = (num - (num%10) )/ 10;
        }
        if(sum>10){
            sum=addDigits(sum);
        }

        return sum;

    }


//    public boolean isPowerOfTwo(int n) {
// return (n > 0) && ((n & (n - 1)) == 0);
//}   -- check this method


//    isPowerOfTwo


    public static boolean isPowerOfTwo(int num){

        if(num==1) return true;

        if(num%2==0){
            return isPowerOfTwo(num/2);
        }

        return false;

    }


    public static void moveZeroes(int[] nums) {

        if(nums.length==1) return;

        int ptr1=0;
        int ptr2=1;


        while(ptr1<=ptr2 && ptr2 < nums.length ){
            if(nums[ptr1]==0){
                if(nums[ptr2]!=0){
                    nums[ptr1]= nums[ptr1] ^ nums[ptr2];
                    nums[ptr2]= nums[ptr1]^ nums[ptr2];
                    nums[ptr1]= nums[ptr1]^ nums[ptr2];
                    ptr1++;
                    ptr2++;
                }else{
                    ptr2++;
                }
            }else{
                ptr1++;
                ptr2++;
            }
        }
    }
}
