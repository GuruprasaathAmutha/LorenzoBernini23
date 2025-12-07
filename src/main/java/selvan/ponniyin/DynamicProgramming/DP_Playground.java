package selvan.ponniyin.DynamicProgramming;

import java.util.Arrays;

public class DP_Playground {


    static int[] memoization = new int[1000];

    public static void main(String[] args) {
//        Arrays.fill(memoization,-1);
        // 0 1 1 2 3 5 8
//        System.out.println(fibo(6));
//        fiboUsingTab(9);

        char i ='a';
        System.out.println(i);
    }



    public static int fibo(int n){
        if(n <=1) return n;
        if(memoization[n] != -1) return memoization[n];

        return memoization[n]=fibo(n-1) + fibo(n-2);
    }


    public static int fiboUsingTab(int n ){


        int prev2=0;
        int prev=1;

        int current =0;
        System.out.print(0+ " " );
        System.out.print(1+ " ");

        for(int i=2;i<=n;i++){
           current= prev +prev2;
           prev2 = prev;
           prev = current;

           System.out.print(current+ " ");
        }
        return current;
    }


}