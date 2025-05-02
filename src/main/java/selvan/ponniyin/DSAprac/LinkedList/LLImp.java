package selvan.ponniyin.DSAprac.LinkedList;

public class LLImp {

    Node head;

    public void insert(int data){
        Node n = new Node(data);
        n.next=null;

        if(head!=null){
            Node node = head;
            while (node.next!=null){
                node= node.next;
            }
            node.next=n;
        }else{
            head = n;
        }
    }

    public void show(){
        Node n = head;
        while(n.next!=null){
            System.out.println(n.data);
            n=n.next;
        }
        System.out.println(n.data);
    }

    public void insertAtStart(int data){
        Node n = new Node(data);
        n.next=head;
        head=n;
    }

    public void insertAt(int index,int data) {
        int count = 0;
        insertAt(index,data,head,count);
    }

    public Node insertAt(int index,int data, Node head,int count){
        if(count ==index-1){
            Node n = new Node(data);
            n.next=head.next;
            head.next=n;
            return head;
        }
        return insertAt(index,data,head.next,++count);
    }


    public int size(){
        Node current = head;
        int count =0;
        while (current.next!=null){
            current=current.next;
            count++;
        }
        return ++count;
    }
}
