package selvan.ponniyin.Streams;

import java.util.Arrays;
import java.util.List;

public class Practiseone {

    public static void main(String[] args) {
//        System.out.println(avg(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,1112)));
//        System.out.println(sum(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,1112)));

        System.out.println(skiptwoElements(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,1112)));

    }




    public static double avg(List<Integer> nums){
        return nums.stream().mapToDouble(n -> n).average().orElse(-1);
    }

    public static double sum(List<Integer> nums){

        return nums.stream().filter(n-> n>10).mapToDouble(Double::valueOf).sum();
//        return nums.stream().mapToInt(n->n).sum();
    }

    public static List<Integer> skiptwoElements(List<Integer> nums) {
        return nums.stream().limit(3).toList();
    }

}
