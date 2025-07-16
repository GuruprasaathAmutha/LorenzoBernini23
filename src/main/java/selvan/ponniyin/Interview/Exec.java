package selvan.ponniyin.Interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exec {


    public static void main(String[] args) {





        List<Integer> nums = Arrays.asList(10, 8, 6, 1, 30);


        //30,10,8,6,1

        System.out.println(nthLargest(nums,2));

//        input: 2
//
//                [5,4,1,2,3]
//
//        input: 3
//
//                [5,4,3,1,2]
    }



    public static int nthLargest(List<Integer> nums, int n){

        return  nums.stream().sorted(Collections.reverseOrder()).skip(n-1).findFirst().orElse(-1);
    }

//    public static List<Integer> sortLastN(List<Integer> nums, int offset){
//
//        return nums.stream().skip(nums.size()-offset).sorted(Collections.reverseOrder()).toList() ;
//    }
}
