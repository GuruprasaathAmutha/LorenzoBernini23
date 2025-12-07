package selvan.ponniyin.DSAprac.Tree;

import java.util.Arrays;

public class RecursionExec {

    public static void main(String[] args) {
//        example(1);
//        backTrack(5); // N to 1 using backtracking
//        System.out.println(sumOfNNumbers(5, 0));

//        System.out.println(functional(5));
//        System.out.println(factorial(6));

//        System.out.println(Arrays.toString(reverseAnArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})));

//        System.out.println(Arrays.toString(reverseRecursion(0,9,new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})));
        System.out.println(fibo(5,0));
    }


    public static void example(int data){
        System.out.println(data);
        if(data == 10){
            return ;
        }
        example(++data);
    }



    public static void backTrack(int data){
        if(data<1){
            return;
        }
        System.out.println(data);
        backTrack(data-1);

    }


    public static int sumOfNNumbers(int n, int sum){

        if(n<0){
            return sum;
        }
        sum = sum + n;
        return sumOfNNumbers(n-1,sum);

    }


    public static int functional(int n){
        if(n==0){
            return 0;
        }
        return n + functional(n-1);
    }


    public static int factorial(int n){
        if(n ==1 || n==0 ){
            return 1;
        }
        return n * factorial(n-1);
    }


    public static int[] reverseAnArray(int[] arr){
        int i=0;
        int j = arr.length-1;
        while(i < j){
            int temp = arr[i];
            arr[i++] = arr[j];
            arr[j--]= temp;
        }
        return arr;
    }

    public static int[] reverseRecursion(int i,int j,int[] arr){
        if(i>j){
            return arr;
        }
        int temp = arr[i];
        arr[i++] = arr[j];
        arr[j--]= temp;
        return reverseRecursion(i++,j--,arr);
    }

    public int minEatingSpeed(int[] piles, int h) {
        int max = Arrays.stream(piles).max().orElse(-1);
        int min = Arrays.stream(piles).min().orElse(-1);

        return 0;
    }


    public static int fibo(int n,int sum){
        if(n==1 || n==0){
            return 1;
        }
        return n + fibo(n-1,0);
    }



}
