package selvan.ponniyin.Greedy;

import java.util.HashMap;
import java.util.Map;

public class GreedyImplementation {

    public static void main(String[] args) {
        System.out.println(lemonadeChange(new int[] {5,5,10,20,5,5,5,5,5,5,5,5,5,10,5,5,20,5,20,5}));
    }

    public static boolean lemonadeChange(int[] bills) {
        Map<Integer,Integer> changeInHand = new HashMap<>();
        changeInHand.put(5,0);
        changeInHand.put(10,0);
        changeInHand.put(20,0);

        for(int bill : bills){
            if(bill==5){
                changeInHand.put(5, changeInHand.get(5)+1);
            }else{
                if(bill==10){
                    if(changeInHand.get(5) > 0){
                        changeInHand.put(5, changeInHand.get(5)-1);
                        changeInHand.put(10, changeInHand.get(10)+1);
                    }else{
                        return false;
                    }
                }else{
                    if(changeInHand.get(5) > 0 && changeInHand.get(10) > 0){
                        changeInHand.put(5, changeInHand.get(5)-1);
                        changeInHand.put(10, changeInHand.get(10)-1);
                        changeInHand.put(20, changeInHand.get(20)+1);
                    }else{
                        return false;
                    }
                }

            }
        }

        return true;
    }
}
