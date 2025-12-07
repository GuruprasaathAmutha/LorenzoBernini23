package selvan.WissenPreparation;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Basics {

    public static void main(String[] args) {
//        HashMap<String,String> map = new HashMap<>();
//        map.put("Guru","Prasaath");
//        map.put("Pradeepikaa","Manivannan");
//        map.put("T","S");
//
//        for(Map.Entry<String,String> entry : map.entrySet()){
//            System.out.println("First Name is " + entry.getKey() + " And the last name is "+entry.getValue());
//        }

//
//        int i =10;
//        int j=10;
//
//        float k = 5.00F;
//        float l = 5.00F;
//
//        double d =3.0;
//        double d1=3.0;


//        Integer i1 = Integer.parseInt("20");
//        Integer i2 = Integer.parseInt("20");


        String s = new String("String");
        String s1 = "String";
        String s2 = "String";

        System.out.println(s==s1);   // false
        System.out.println(s1==s2);  // true
        System.out.println(s.equals(s1));  // true
        System.out.println(s1.equals(s2)); //true

    }
}
