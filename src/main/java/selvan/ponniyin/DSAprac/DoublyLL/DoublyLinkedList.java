package selvan.ponniyin.DSAprac.DoublyLL;

public class DoublyLinkedList {

    private DLLNode head;

    void add(int data){
        if(head==null){
            head = new DLLNode(data);
        }else {
            DLLNode current = head;

            while (current.next !=null){
                current = current.next;
            }

            DLLNode newnode = new DLLNode(data);
            current.next = newnode;
        }

    }

    void print(){
        DLLNode current = head;
        while(current.next!=null){
            System.out.println(current.data);
            current=current.next;
        }
        System.out.println(current.data);

    }

}
