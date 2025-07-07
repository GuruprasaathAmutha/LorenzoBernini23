package selvan.ponniyin.DSAprac;



import selvan.ponniyin.mac.Employee;
import selvan.ponniyin.mac.Practise;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

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
//        System.out.println(kthElement(new int[] {100, 112, 256, 349, 770},new int[]{72, 86, 113, 119, 265, 445, 892},7));
//        moveZeroes(new int[] {0,1,0,3,12});
//        System.out.println(isSubsequence("abc","ahbgdc"));
//        System.out.println(maxArea(new int[]{1,1}));//height = [1,8,6,2,5,4,8,3,7]
//        System.out.println(maxOperations(new int[]{1,2,3,4},5));
//        System.out.println(maxOperations(new int[]{4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4},2));
//        System.out.println(canCompleteCircuit(new int[]{1,2,3,4,5},new int[]{3,4,5,1,2})); "a","a","b","b","c","c","c"

//        System.out.println(findMaxAverage(new int[]{-1},1));
//        System.out.println(maxVowels("weallloveyou",7));
//        Map<String,String> dummy = new HashMap<>();

//        findDifference(new int[] {1,2,3},new int[] {2,4,6});
//        System.out.println(uniqueOccurrences(new int[]{1, 2, 2, 1, 3}));


//        ListNode n = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
//
//        ListNode n2 =Solution.reverseList(n);
//
//
//        System.out.println("n2");


//        System.out.println(longestPalindromicSubstring("malayalam"));

//        Optional<Employee> o = Optional.ofNullable(checkOptional(1));
//
//        if(o.isPresent()){
//            System.out.println("Object is present");
//            System.out.println(o.get().getName());
//        }else{
//            System.out.println("Null");
//        }

        System.out.println(findMaxLength(new int[]{0, 1}));
    }




    public static  int findMaxLength(int[] nums) {

        int max=0;
        int zero=0;
        int one=0;

        int ptr2=0;

        while(ptr2<nums.length){
            if(nums[ptr2]==0){
                zero++;
            }else{
                one++;
            }

            if(zero==one){
                max++;
            }
            ptr2++;

        }

        return max;

    }



    public static Employee checkOptional(int i){
        if(i==0){
            return new Employee(1,"Guru",1000,"HBO");
        }else{
            return null;
        }
    }

    public static String longestPalindromicSubstring(String s){
        String result ="";
        int longest=0;
        char[] sarr = s.toCharArray();
        for(int k=0 ;k < sarr.length;k++){

            int i=k;
            int j=k;

            while(i>=0 && j < s.length() && sarr[i]==sarr[j]){
                if(j-i +1 > longest){
                    longest=j-i+1;
                    result = s.substring(i,j+1);
                }
                i-=1;
                j+=1;
            }

            i=k;
            j=k+1;

            while(i>=0 && j<s.length() && sarr[i]==sarr[j]){
                if(j-i+1 > longest){
                    longest=j-i+1;
                    result=s.substring(i,j+1);
                }
                i-=1;
                j+=1;
            }
        }
        return result;
    }


    public static boolean isPalindrome(String s){
        String r = new StringBuilder(s).reverse().toString();
        return r.equalsIgnoreCase(s);
    }





    class Solution {
        public static ListNode reverseList(ListNode head) {
            Stack<Integer> s = traverse(head);
            ListNode l1 = new ListNode();
            return insertReverse(l1,s);
        }


        public static ListNode insertReverse(ListNode n , Stack<Integer> s){
            if(!s.isEmpty()){
                n.val=s.pop();
                if(!s.isEmpty()){
                    n.next = new ListNode();
                    n.next= insertReverse(n.next,s);
                }


            }
            return n;
        }


        public static Stack<Integer> traverse(ListNode head){
            Stack<Integer> s1 = new Stack<Integer>();
            if(head!=null){
                s1.push(head.val);
                while (head.next!=null){
                    head=head.next;
                    s1.push(head.val);
                }

            }else{
                return null;
            }

            return s1;
        }
    }



    public static ListNode reverseList(ListNode head) {

        return null;
    }


    class RecentCounter {

        Queue<Integer> queue;

        public RecentCounter() {
            queue = new PriorityQueue<>();
        }

        public int ping(int t) {
            queue.add(t);
            removeOldPings(t);
            return queue.size();
        }


        public void removeOldPings(int t){

            while(queue.element()< (t-300)){
                queue.poll();
            }

        }
    }





    public  static boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> occurences = new HashMap<>();
        Set<Integer> one = new HashSet<>();
        for(int x : arr){
            if(!occurences.containsKey(x)){
                occurences.put(x,0);
            }else{
                occurences.put(x,occurences.get(x)+1);
            }
        }
       for(int i : occurences.keySet()){
           one.add(occurences.get(i));
       }
        return one.size()==occurences.size();


    }



    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<> ();

        Set<Integer> n1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> n2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());


        for(int i : nums2){
            n1.remove(i);
        }

        for(int i : nums1){
            n2.remove(i);
        }

        answer.add(n1.stream().toList());
        answer.add(n2.stream().toList());
        return answer;
    }


    public static int maxVowels(String s, int k) {
        int maxcount=0;
        int count=0;
        int ptr1=0;
        int ptr2=k-1;
        char[] sarr = s.toCharArray();
        List<Character> vowels = Arrays.asList('a','e','i','o','u');
        for(int i=0; i<k;i++){
            if(vowels.contains(sarr[i])){
                count++;
            }
        }

        while(ptr2 < s.length()){
            maxcount = Math.max(maxcount,count);
            if(vowels.contains(sarr[ptr1++])){
                count--;
            }
            if(ptr2!=s.length()-1){
                if(vowels.contains(sarr[++ptr2])){
                    count++;
                }
            }else{
                ptr2++;
            }
        }
        return maxcount;

    }




    public static double findMaxAverage(int[] nums, int k) {

        if(nums.length ==1) return (double)nums[0];
        int ptr1=0;
        int ptr2=k-1;
        int sum=0;
        double result=Integer.MIN_VALUE;

        while(ptr2 < nums.length){
            for(int i=ptr1 ; i<=ptr2;i++){
                sum+= nums[i];
            }
            result = Math.max(result, (double) sum/k);
            sum=0;
            ptr1++;
            ptr2++;
        }

        return result;
    }




    public static int compress(char[] chars) {

        if(chars.length==1) return 1;
        char current = chars[0];
        int count =0;
        int ptr1=0;
        int ptr2=0;


        while(ptr2 < chars.length){
            if(chars[ptr2]==current){
                count++;
                ptr2++;
                if(ptr2>chars.length-1){
                    if(count<10){
                        chars[++ptr1]= (char) ('0' + count);
                        current = chars[++ptr1];
                        count=0;
                    }else{
                        for(int j=0; j<= String.valueOf(count).length()-1;j++){
                            chars[++ptr1]= String.valueOf(count).charAt(j);
                        }
                        current=chars[++ptr1];
                        count=0;
                    }
                }
            }else{
                if(count==1){
                    count=0;
                    current=chars[++ptr1];
                }else{
                    if(count<10){
                        chars[++ptr1]= (char) ('0' + count);
                        current = chars[++ptr1];
                        count=0;
                    }else{
                        for(int j=0; j<= String.valueOf(count).length()-1;j++){
                            chars[++ptr1]= String.valueOf(count).charAt(j);
                        }
                        current=chars[++ptr1];
                        count=0;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(chars));
        return ptr1;
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {

        return 0;
    }




    public static int maxOperations(int[] nums, int k) {
        int counter=0;
        int ptr1=0;
        int ptr2=1;
        Arrays.sort(nums);
        List<Integer> memo = new ArrayList<>();

        while(ptr1<nums.length && ptr2<nums.length){

            if(!memo.contains(ptr1) && !memo.contains(ptr2)){
                if(nums[ptr1] + nums[ptr2] != k){
                    ptr2++;
                }else{
                    memo.add(ptr1++);
                    memo.add(ptr2);
                    ptr2 = ptr1+1;
                    counter++;
                }
            }else{
                ptr1++;
                ptr2++;
            }
        }
        return counter;
    }

    public static int maxArea(int[] height) {

        //height is height[i]
        //width is i

        int i=0;
        int j=height.length-1;
        int max=0;

        while(i<j){
            int area = Math.min(height[i],height[j])*  (j - i);
            if(Math.min(height[i],height[j]) == height[i]){
                i++;
            }else{
                j--;
            }
            max = Math.max(area,max);
        }
        return max;
    }


    public static boolean isSubsequence(String s, String t) {

        if(t.contains(s)) return true;

        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();

        int i=0;
        int j=0;

            while(j<=t.length()-1){
                if(sarr[i]==tarr[j++]){
                    i++;
                    if(i>s.length()-1){
                        return true;
                    }
                }
            }

        return false;
    }


    public static void moveZeroes(int[] nums) {
        if(nums.length==1) return;

        int ptr1=0;
        int ptr2=1;

        while(ptr2<nums.length){
            if(nums[ptr1]==0){
                if(nums[ptr2]!=0){
                    int temp = nums[ptr2];
                    nums[ptr2]=nums[ptr1];
                    nums[ptr1]=temp;
                    ptr1++;
                    ptr2++;
                }else{
                    ptr2++;
                }
            }else{
                ptr1++;
                ptr2++;
            }
        }


        System.out.println(Arrays.toString(nums));


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