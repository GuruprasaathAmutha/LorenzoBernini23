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

//        System.out.println(addDigits(0));

//        Person p1 = new Person(23,"Guru","yes");
//        Person p2 = new Person(25,"Prasaath","yes");
//        Person p3 = new Person(23,"Guru","yes");
//
//
//        System.out.println(p1.hashCode());
//        System.out.println(p3.hashCode());
//
//
//        System.out.println(p1.equals(p3));


//        String s1 =  new String( "Guru");
//        String s2 = "Guru";
//
//
//        System.out.println(s1.hashCode());
//        System.out.println(s2.hashCode());
//
//        System.out.println(s1==s2);
//        System.out.println(s1.equals(s2));


        System.out.println(Arrays.toString(productExceptSelf(new int[]{1,2,3,4})));
    }



    public static int[] productExceptSelf(int[] nums) {
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
