package selvan.WissenPreparation;

import java.util.*;

public class Interview {

        public static void main(String[] args) {
//                System.out.println(isValid("()"));
//                HashMap<Integer,Integer> map = new HashMap<>();
//
                System.out.println(Integer.MAX_VALUE);
//                System.out.println(Integer.MIN_VALUE);

                System.out.println(reverse(1999999999));


                List<Integer> l = new ArrayList<>();

                int[] a =l.stream().mapToInt(Integer::intValue).toArray();

        }

        public static int[] intersection(int[] nums1, int[] nums2) {


                return null;
        }



        public static int reverse(int x) {

                long l = (long) 0;
                String s = String.valueOf(x);
                int len =   s.charAt(0)=='-'? s.length()-2 : s.length()-1;

                while(len>=0){
                        l += (long) ((long) (x%10) * Math.pow(10,len--));
                        x/=10;
                }

                return (l > Integer.MAX_VALUE || l < Integer.MIN_VALUE) ? 0: (int)l ;
        }


        public static  boolean isValid(String s) {
                Stack<String> stack = new Stack<String>();

                for(String c : s.split("")){
                        if(c.equals("{")){
                                stack.push("}");
                        }else if (c.equals("[")){
                                stack.push("]");
                        }else if (c.equals("(")){
                                stack.push("(");
                        }else{
                                if(stack.peek().equals(c)){
                                        stack.pop();
                                }
                        }
                }

                return stack.isEmpty();
        }



}
