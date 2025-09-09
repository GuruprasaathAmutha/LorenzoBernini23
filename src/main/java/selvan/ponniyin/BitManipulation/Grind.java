package selvan.ponniyin.BitManipulation;

import java.util.Arrays;
import java.util.Stack;

public class Grind {



    public static void main(String[] args) {
//        System.out.println(binaryToDecimal("11111111"));
//
//        System.out.println(DecimalToBinary("5"));




//        System.out.println( Arrays.toString(onesComp(new int[] {1,0,1,1,1}))) ;


        System.out.println(1<<4);
//        System.out.println(twosComp(new int[] {1,0,1,1,1}).toString());



    }



    public static int bintoDeci(int i){

        int max=0;
        int count=0;





        return max;

    }


    public static int[] onesComp(int[] arr){

    return Arrays.stream(arr).map(i -> ~i ).toArray();
    }


    public static int[] twosComp(int[] arr){

        return null;
    }



    public static String binaryToDecimal(String binary){

        Stack<Integer> s = new Stack<>();
        char[] carr = binary.toCharArray();
        int count=0;
        int decimal=0;
        for (char c : carr) {
            s.push(Integer.parseInt(String.valueOf(c)));
        }
        while(!s.isEmpty()){
            decimal += (int) (s.pop() * Math.pow(2,count++));
        }
        return String.valueOf(decimal);
    }

    public static String DecimalToBinary(String decimal){
        int d = Integer.parseInt(decimal);
        StringBuilder sb = new StringBuilder();
        while(d !=1){
            sb.append(  String.valueOf( d%2 ));
            d=d/2;
        }
        sb.append("1");
        return sb.reverse().toString();
    }



}
