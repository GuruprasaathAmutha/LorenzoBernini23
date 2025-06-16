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
//        List<String> names = new ArrayList<>();
//
//        names.add("Guru");
//        names.add("Guru");
//        names.add("Guru");
//        names.add("Guru");
//        names.add("Guru");
//        names.add("Guru");
//
//        List<String> res = changeCase(names, CaseCasting.LowerCase);
//        System.out.println(res.toString());


        System.out.println(evenAvg(Arrays.asList(1, 2, 3, 4,5,6)));

    }


//    Write a Java program to calculate the average of prime numbers from a list of integers using streams.











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
