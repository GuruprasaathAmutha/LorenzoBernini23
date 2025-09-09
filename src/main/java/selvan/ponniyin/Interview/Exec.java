package selvan.ponniyin.Interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.stream.IntStream;

public class Exec {


    public static void main(String[] args) {

//        System.out.println(removeStars("leet**cod*e"));
        System.out.println(minEatingSpeed(new int[]{3,6,7,11},8));

    }



    public static int minEatingSpeed(int[] piles, int h) {
        int max = Arrays.stream(piles).max().orElse(0);
        int[] possibleOutcomes = IntStream.range(1,max+1).toArray();
        System.out.println(timeTaken(3, piles));
        int res = minEatingSpeedBananas(possibleOutcomes,piles,0,possibleOutcomes.length-1,h);
        return 0;
    }

    public static int timeTaken(int speed,int[] piles){
        int time=0;
        for(int i : piles){
           time += (int) Math.ceil((double)i/  (double)speed);
        }
        return time;
    }

    public static int minEatingSpeedBananas(int[] possibleOutcomes,int[] piles,int start,int end ,int targetHour){

        int mid = (start+end)/2;

        if( timeTaken( possibleOutcomes[mid],piles) <= targetHour){

        }
        return 0;
    }



    public static String removeStars(String s) {

        String[] sarr = s.split("");
        StringBuilder sb = new StringBuilder();

        Stack<String> stack= new Stack();
        for(String a: sarr){
            if(!a.equals("*")){
                stack.push(a);
            }else{
                stack.pop();
            }
        }
        for(String a : stack){
            sb.append(a);
        }
        return sb.toString();
    }


}
