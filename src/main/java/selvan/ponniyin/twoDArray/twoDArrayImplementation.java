package selvan.ponniyin.twoDArray;

import java.util.PriorityQueue;

public class twoDArrayImplementation {


    public static void main(String[] args) {
        int[][] arr = new int[3][2];

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(77);
        pq.add(22);
        pq.add(88);
        pq.add(22);
        pq.add(12);

        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }




        System.out.println(arr[1].length);
    }



}
