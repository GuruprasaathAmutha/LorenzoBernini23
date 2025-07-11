package selvan.ponniyin;

import java.util.Optional;

public class OptionalPractise {


    public static void main(String[] args) {

        java.util.Optional<String> optString = Optional.ofNullable(optionalCheckString(0));

        String name = optString.orElseGet(() -> "Default");
        System.out.println(name);

    }



    public static String optionalCheckString(int i){
        if(i==0){
            return null;
        }else{
             return "Guru";
        }
    }

}
