package selvan.ponniyin.DSAprac.LinkedList;

public class LLExec {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        for(int i : new int[]{1,3,4,7}){
            linkedList.add(i);
        }

        System.out.println(pairSum(linkedList.head));


    }

    Node deleteMiddleNode(Node node){
        return null;
    }


     static int findMiddleNode(Node node){

        Node fast = node;
        Node slow = node;

        while(fast!=null && fast.next!=null){
            fast= fast.next.next;
            slow = slow.next;
        }

        return slow.data;
    }



//1347
    public static int pairSum(Node head) {
        Node slow = head;
        Node fast = head;
        Node prev = null;
        int counter =0;
        int max=0;

        while(fast!=null && fast.next!=null){
            fast= fast.next.next;

            Node next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;

            counter ++;
        }

        if(counter%2==0){
            fast = slow;
            while(fast!=null){
                max = Math.max(max, prev.data + fast.data  );
                prev = prev.next;
                fast = fast.next;
            }

        }else{
            fast = slow.next;
            slow.next=prev;
            while(slow!=null && fast!=null){
                max = Math.max(max, slow.data + fast.data);
                slow = slow.next;
                fast = fast.next;
            }

        }

        return max;

    }


}
