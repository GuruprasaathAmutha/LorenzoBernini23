package selvan.ponniyin.DSAprac.Tree;

public class BinarySearchTree {

    Node Root;

    void add(int data){
        Root = addRec(Root,data);
    }

   private Node addRec(Node node,int data){
        if(node==null){
         node = new Node(data);
         return node;
        }else if(node.data < data){
            node.left = addRec(node.left,data);
        }else{
            node.right= addRec(node.right,data);
        }
        return node;
    }

    public void PreOrder(){
        PreOrderRec(Root);
    }

    public void InOrder(){
        InOrderRec(Root);
    }

    public void PostOrder(){
        PostOrderRec(Root);
    }

    private void  PreOrderRec(Node root){
      if(root ==null) return;
      System.out.println(root.data);
      PreOrderRec(root.left);
      PreOrderRec(root.right);
    }

    private void InOrderRec(Node root){
        if(root==null) return;
        InOrderRec(root.right);
        System.out.println(root.data);
        InOrderRec(root.left);


    }

    private void PostOrderRec(Node root){
        if(root==null) return;
        InOrderRec(root.left);
        InOrderRec(root.right);
        System.out.println(root.data);

    }

}
