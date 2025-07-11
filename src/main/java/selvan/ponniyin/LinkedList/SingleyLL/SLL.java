package selvan.ponniyin.LinkedList.SingleyLL;

public class SLL {


    Node head;

    public void add(int val){
        Node node = new Node(val);

        if(head!=null){
          head.next=  recAdd(head,val);
        }else{
            head=node;
        }
    }


    public Node recAdd(Node node,int val){

        if(node.next!=null){
            node.next=recAdd(node.next,val);
        }else{
            return new Node(val);
        }
        return node;
    }
}
