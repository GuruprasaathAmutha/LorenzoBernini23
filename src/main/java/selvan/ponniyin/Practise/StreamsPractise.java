package selvan.ponniyin.Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsPractise {
    public static void main(String[] args) {
//        List<Integer> nums = new ArrayList<>();
//        for(int i=0;i<10;i++){
//            nums.add(i*2);
//        }
//        System.out.println(avg(nums));
//
//        System.out.println(evenAvg(Arrays.asList(1, , 3, 4,5,6)));
//        System.out.println(isPrime(8));/
//        System.out.println(primeAvg(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12)));
//        System.out.println(threshold(Arrays.asList(10,20,30,40,55,111,222),40));
        System.out.println(csString(Arrays.asList("Guru","Prasaath","Amutha")));
    }


    //Write a Java program to convert a list of strings to lowercase
    // using streams and sort them by their lengths.


//    public static List<String> sortLength(List<Integer> rope){
//        return rope.stream().
//    }




//    Write a Java program to convert a list of strings to uppercase using streams
//    and then join them into a single comma-separated string.

    public static String csString(List<String> rope){
        return rope.stream().map(String::toUpperCase).reduce("",(a,b) -> a +","+b);
    }



//    Write a Java program to compute the average of a list of integers
//    using streams after filtering out numbers exceeding a given threshold.


    public static double threshold(List<Integer> nums,int t){
        return nums.stream().filter(n -> n > t).mapToDouble(Integer::doubleValue).average().orElse(0.0);
    }







//    Write a Java program to calculate the average of prime numbers from a list of integers using streams.

    public static double primeAvg(List<Integer> nums){
        return nums.stream().filter(StreamsPractise::isPrime).mapToDouble(Integer::doubleValue).average().orElse(0.0);
    }



    public static boolean isPrime(int num){
        if(num<=1) return false;
        if(num==2) return true;
        if(num%2==0) return false;

        for(int i=3 ; i <= Math.sqrt(num);i += 2){
            if(num%i==0) return false;
        }
        return true;
    }









    //    Write a Java program to compute the average of even numbers in a list using streams
//    and subtract it from the average of odd numbers.
    public static double evenAvg(List<Integer> num) {

        double evenAvg = num.stream().filter(n -> n%2==0).mapToDouble(Integer::doubleValue).average().orElse(0.0);

        double oddAvg = num.stream().filter(n -> n%2!=0).mapToDouble(Integer::doubleValue).average().orElse(0.0);

        System.out.println(evenAvg);
        System.out.println(oddAvg);

        return evenAvg-oddAvg;
    }


//    Write a Java program to calculate the weighted average of a list of integers using streams,
//    where each integer
//    is weighted by its index.

    public static double weightedAvg(List<Integer> num) {

        int numerator = IntStream.range(0, num.size()).map(n -> num.get(n) * n).sum();

        int denominator = IntStream.range(0, num.size()).sum();


        return (double) numerator / denominator;
    }


    public static double avg(List<Integer> num) {
        return num.stream().mapToDouble(n -> (double) n + 2).average().orElse(0.0);
    }


    public static List<String> changeCase(List<String> input, CaseCasting desiredCase) {
        if (desiredCase == CaseCasting.UpperCase) {
            return input.stream().map(String::toUpperCase).collect(Collectors.toList());
        } else {
            return input.stream().map(String::toLowerCase).collect(Collectors.toList());
        }
    }
}
