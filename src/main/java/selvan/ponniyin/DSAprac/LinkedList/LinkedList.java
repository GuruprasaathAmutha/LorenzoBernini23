package selvan.ponniyin.DSAprac.LinkedList;

public class LinkedList {

    Node head;



    void add(int data){
        if(head==null){
            head = new Node(data);
        }else{
            add(head,data);
        }
    }


    void add(Node head,int data){

        while(head!=null){
            head=head.next;
        }
        head=new Node(data);
    }

}
