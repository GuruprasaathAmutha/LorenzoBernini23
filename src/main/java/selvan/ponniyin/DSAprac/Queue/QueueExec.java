package selvan.ponniyin.DSAprac.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExec {

    public static void main(String[] args) {
        predictPartyVictory("ASDFAG");
    }




    public static String predictPartyVictory(String senate) {

        Queue<String> senQ = new LinkedList<>();

        for(String s : senate.split("")){
            senQ.offer(s);
        }



        return "";
    }
}
