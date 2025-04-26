package selvan.ponniyin.DSAprac;

import selvan.ponniyin.DSAprac.Sort.MergeSort;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DaVinci {

    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        ms.MergeSortMethod(new int[] {1,6,2,62,4,8,2,8,11,33});
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