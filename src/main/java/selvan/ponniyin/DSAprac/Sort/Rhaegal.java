package selvan.ponniyin.DSAprac.Sort;


import java.math.BigInteger;

public class Rhaegal {
    public static void main(String[] args) {
//        System.out.println( Integer.sum(1, (int)  Math.pow(10,2)));
//[1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1]
//        int[] o = new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
//        ListNode one = new ListNode();
//        one = addNode(o, 0, one);
//        int[] t = new int[]{5, 6, 4};
//        ListNode two = new ListNode();
//        two = addNode(t, 0, two);
//        ListNode res = addTwoNumbers(one, two);
//        System.out.println("check");
        BigInteger a = BigInteger.valueOf(1000000);
        System.out.println(  a.divideAndRemainder(BigInteger.valueOf(10))[1]);

    }

    public static ListNode addNode(int[] data, int index, ListNode one) {
        while (index < data.length) {
            one = new ListNode(data[index]);
            one.next = addNode(data, ++index, one.next);
            break;
        }
        return one;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger one = BigInteger.valueOf(0), two = BigInteger.valueOf(0);
        int pwr = 0;
        ListNode result = new ListNode();

        while (l1 != null) {
            one = one.add(BigInteger.valueOf(l1.val * (long) Math.pow(10, pwr++)));
            l1 = l1.next;
        }
        pwr = 0;
        while (l2 != null) {
            two = two.add(BigInteger.valueOf(l2.val * (long) Math.pow(10, pwr++)));
            l2 = l2.next;
        }
        BigInteger res = one.add(two);

//        return add(res,result);
        return null;
    }


    static ListNode add (BigInteger res,ListNode result){
        while(res>0){
            result = new ListNode(res.divideAndRemainder(BigInteger.valueOf(10))[0].intValue());
            res = (res - (res%10))/10;
            result.next = add(res,result.next);
            break;
        }
        return result;
    }
}
