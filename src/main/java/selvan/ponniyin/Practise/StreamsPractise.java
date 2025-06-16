package selvan.ponniyin.Practise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsPractise {
    public static void main(String[] args) {
//        List<Integer> nums = new ArrayList<>();
//        for(int i=0;i<10;i++){
//            nums.add(i*2);
//        }
//        System.out.println(avg(nums));

        List<String> names = new ArrayList<>();

        names.add("Guru");
        names.add("Guru");
        names.add("Guru");
        names.add("Guru");
        names.add("Guru");
        names.add("Guru");

        List<String> res = changeCase(names, CaseCasting.LowerCase);
        System.out.println(res.toString());


    }


    public static double avg(List<Integer> num) {
        return num.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
    }


    public static List<String> changeCase(List<String> input, CaseCasting desiredCase) {
        if (desiredCase == CaseCasting.UpperCase) {
            return input.stream().map(String::toUpperCase).collect(Collectors.toList());
        } else {
            return input.stream().map(String::toLowerCase).collect(Collectors.toList());
        }
    }
}
