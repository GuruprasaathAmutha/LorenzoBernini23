package selvan.ponniyin.DSAprac.LinkedList;

public class LinkedList {

    Node head;


    public void add(int data){
        if(head == null){
            head = new Node(data);
        }else{
            Node current = head;

            while(current.next!=null){
                current=current.next;
            }
                current.next=new Node(data);
        }
    }


    public void printAll(){
        if (head==null){
            System.out.println("Linked list is emptyy");
            return;
        }else{
            Node current = head;

            while(current!=null){
                System.out.println(current.data);
                current=current.next;
            }
        }

    }



}
