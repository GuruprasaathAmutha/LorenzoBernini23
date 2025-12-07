package selvan.WissenPreparation.LRUCache;

public class DLLNode {
    int key;
    int value;
    DLLNode prev;
    DLLNode next;


    public DLLNode(){

    }

    public DLLNode(int key,int value){
        this.key=key;
        this.value=value;
    }


    public DLLNode(int data,DLLNode prev,DLLNode next){
        this.key=key;
        this.value=value;
        this.prev=prev;
        this.next=next;
    }
}
