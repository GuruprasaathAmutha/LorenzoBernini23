package selvan.ponniyin.DSAprac;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DaVinci {


    public static void main(String[] args) {
        HashMap<Character,Integer> smap,tmap = new HashMap<>();

        String s = "jean";
        String k = "neaj";
        System.out.println(isAnagramII(s, k));

    }


    public static boolean isAnagramII(String s,String t){
            if(s.length()==t.length()){
                int[] count = new int[26];
                for(int i=0;i<s.length();i++){
                    count[s.charAt(i)-'a']++;
                    count[t.charAt(i)-'a']--;
                }
                for(int i=0;i<count.length;i++){
                    if(count[i]!=0){
                        return false;
                    }
                }
            }else{
                return false;
            }
            return true;
    }


    public static boolean isAnagram(String s,String t){
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();
        HashMap<Character,Integer> smap = new HashMap<>(),tmap = new HashMap<>();
        for(int i=0;i<sarr.length;i++){
            if(!tmap.containsKey(tarr[i])){
                tmap.put(tarr[i],1);
            }else{
                tmap.put(tarr[i],smap.get(tarr[i])+1);
            }
            if(!smap.containsKey(sarr[i])){
                smap.put(sarr[i],1);
            }else {
                smap.put((sarr[i]),smap.get(sarr[i])+1);
            }
        }
        for ( char key : smap.keySet() ){
            if(tmap.containsKey(key)){
                if(tmap.get(key) == smap.get(key)){
                    continue;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
        return true;
    }


    public static int hIndex(int[] citations) {
        Arrays.sort(citations);
        int h=0;
        for(int i=citations.length-1;i>=0;i--){
            if(citations[i] > h){
                h++;
            }else{
                return h;
            }
        }
        return h;
    }
    class RandomizedSet {


        Set<Integer> sett;


        public RandomizedSet() {
            sett = new HashSet<Integer>();
        }

        public boolean insert(int val) {
                return sett.add(val);
        }

        public boolean remove(int val) {
                return sett.remove(val);
        }

        public int getRandom() {
            return 1;

        }
    }

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
}