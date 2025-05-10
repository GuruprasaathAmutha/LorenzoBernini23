package selvan.ponniyin.Practise;

public class BinaryTree {
    Node Root;

    public BinaryTree(int data){
        this.Root = new Node(data);
    }

    void add(int data){
        Root=addRec(Root,data);
    }

    void PreOrder(){
        PreOrderRec(Root);
    }

    void InOrder(){
        InOrderRec(Root);
    }

    void PostOrder(){
        PostOrderRec(Root);
    }

    private void PostOrderRec(Node node){
        if(node == null) return;

        PostOrderRec(node.right);
        PostOrderRec(node.left);
        System.out.println(node.data);
    }

    private void InOrderRec(Node node){
        if(node==null)  return;
        InOrderRec(node.right);
        System.out.println(node.data);
        InOrderRec(node.left);
    }

    private void  PreOrderRec(Node node){
        if(node == null) return;
        System.out.println(node.data);
        PreOrderRec(node.right);
        PreOrderRec(node.left);
    }

    private Node addRec(Node node,int data){
        if(node == null ) {
            node = new Node(data);
            return node;
        } else if (data < node.data) {
            node.left = addRec(node.left,data);
        }else{
            node.right = addRec(node.right,data);
        }
        return node;
    }






}
