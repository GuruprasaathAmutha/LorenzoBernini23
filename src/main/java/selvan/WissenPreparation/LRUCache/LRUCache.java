package selvan.WissenPreparation.LRUCache;

import java.util.HashMap;

public class LRUCache {

    HashMap<Integer,DLLNode> map ;
    DLLNode head;
    DLLNode tail;
    int capacity;

    public LRUCache(int capacity){
        this.capacity=capacity;
        head= new DLLNode();
        tail= new DLLNode();
        head.next=tail;
        tail.prev=head;
        map = new HashMap<>(capacity);
    }

    public void put(int key,int value){
        DLLNode node = new DLLNode(key,value);
        if(map.isEmpty()){
            addNextToHead(node);
        }else{
            if(map.size()==capacity){
                removeRecentlyUsed();
                addNextToHead(node);
            }else{
                addNextToHead(node);
            }
        }
    }

    public int get(int key){
        if(map.isEmpty()) {
            System.out.println("No values are there in cache");
        }
        if(map.containsKey(key)){
            removeNode(map.get(key));
            addNextToHead(map.get(key));
            return map.get(key).value;
        }else{
            return -1;
        }
    }

    public void addNextToHead(DLLNode node){

        if(map.isEmpty()){
            head.next= node;
            node.prev= head;

            node.next=tail;
            tail.prev= node;

            map.put(node.key,node);
        }else{
            DLLNode temp = head.next;
            head.next= node;
            node.prev=head;

            node.next= temp;
            temp.prev=node;

            map.put(node.key,node);
        }

    }

    public DLLNode removeNode(DLLNode node){
        DLLNode p = node.prev;
        DLLNode n = node.next;
        p.next = n.prev;
        return node;
    }

    public void removeRecentlyUsed(){
        DLLNode last = tail.prev;
        DLLNode lastbefore = last.prev;
        lastbefore.next = tail.prev;
    }

    public void printLRUCache(){
        DLLNode current = head;

        if(head==null){
            System.out.println("The cache is empty");
        }else {
            while (current!=null){
                System.out.println("key is "+ current.key +" value is "+current.value);
                current=current.next;
            }
        }
    }




}
