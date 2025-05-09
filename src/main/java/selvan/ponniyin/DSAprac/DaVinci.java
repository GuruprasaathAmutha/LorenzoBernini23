package selvan.ponniyin.DSAprac;

import selvan.ponniyin.DSAprac.LinkedList.DLL;
import selvan.ponniyin.DSAprac.LinkedList.LLImp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DaVinci {


    public static void main(String[] args) {
//        HashMap<Character,Integer> smap,tmap = new HashMap<>();
//        String s = "jean";
//        String k = "neaj";
//        System.out.println(isAnagramII(s, k));
//        LLImp linkedlist = new LLImp();
//        linkedlist.insert(1);
//        linkedlist.insert(2);
//        linkedlist.insert(3);
//        linkedlist.insertAtStart(10);
//        linkedlist.insertAt(3,5);
//        linkedlist.show();
//        System.out.println("Size of the list is " +linkedlist.size());
//        canPlaceFlowers(new int[]{1,0,0,0,0,1},2);
//        System.out.println(( 567   -  (567%10) ) /10);
//        ListNode one = new ListNode(2 , new ListNode(4, new ListNode(3)));
//        ListNode two = new ListNode(5, new ListNode(6, new ListNode(4)));
//      ListNode res =  addTwoNumbers(one,two);
//        System.out.println("What the fook is this!");
//        2
//5 5 8 8 8 9 11 11 11 11 11
//4 4 4 4 6 8 9 9 9 11 13  a[] = [100, 112, 256, 349, 770], b[] = [72, 86, 113, 119, 265, 445, 892], k = 7
//        System.out.println(kthElement(new int[] {5 ,5, 8, 8, 8, 9, 11, 11, 11, 11, 11} , new int[] {4 ,4, 4, 4, 6, 8, 9, 9, 9, 11, 13},2));
//        System.out.println(kthElement(new int[] {2,3,6,7,9},new int[]{1,4,8,10},5));
        System.out.println(kthElement(new int[] {100, 112, 256, 349, 770},new int[]{72, 86, 113, 119, 265, 445, 892},7));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];



        return null;
    }


    public static int kthElement(int a[], int b[], int k) {
        // code here
        int count=0;
        int[] res = new int[k+1];
        int i=0;
        int j=0;


        while(count<k){
            if(a[i]<b[j]){
                res[count++]=a[i++];
            }else{
                res[count++]=b[j++];
            }
        }

        return res[k-1];

    }



       public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
        public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int one =0 , two =0;
            int pwr=0;
            ListNode result = new ListNode();

            while(l1!=null){
                one += l1.val * Math.pow(10,pwr++);
                l1=l1.next;
            }
            pwr=0;
            while(l2!=null){
                two += l2.val * Math.pow(10,pwr++);
                l2=l2.next;
            }
            int res = one+two;

            return add(res,result);

        }


        static ListNode add (int res,ListNode result){
            while(res>0){
                result = new ListNode(res%10);
                res = (res - (res%10))/10;
                  result.next = add(res,result.next);
            }
            return result;
        }



    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> store = new HashMap<Integer,Integer>();

        for(int i=0;i<nums.length;i++){
            if(store.containsKey(target-nums[i])){
                return new int[] {store.get(target-nums[i]),i};
            }else{
                store.put(nums[i],i);
            }
        }

        return new int[]{0,0};
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int max=0;

        if(flowerbed.length==1){
            if(flowerbed[0]==0){
                max++;
            }
            return max>=n;
        }

        for(int i=0;i<flowerbed.length;i++){
            if(i==0) {
                if(flowerbed[i]==0 && flowerbed[i+1]==0){
                    flowerbed[i]=1;
                    max++;
                    continue;
                }else{
                    continue;
                }

            }else if (i==flowerbed.length-1){
                if(flowerbed[i]==0 && flowerbed[i-1]==0 ){
                    flowerbed[i]=1;
                    max++;
                    continue;
                }else{
                    continue;
                }
            }else if (flowerbed[i]==0 && flowerbed[i-1]==0 && flowerbed[i+1]==0){
                max++;
                flowerbed[i]=1;
                continue;
            }
        }
        return max >= n;
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