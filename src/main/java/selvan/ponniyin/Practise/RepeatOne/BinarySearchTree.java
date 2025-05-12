package selvan.ponniyin.Practise.RepeatOne;

public class BinarySearchTree {
    Node Root;

    void addData(int data){
        Root=addData(Root,data);
    }

    void preOrderTraversal(){
        preOrderTraversal(Root);
    }

    void inOrderTraversal(){
        inOrderTraversal(Root);
    }

    void postOrder(){
        postOrder(Root);
    }

    private void postOrder(Node node){
        if(node==null) return;
        postOrder(node.right);
        postOrder(node.left);
        System.out.println(node.data);
    }

    private void inOrderTraversal(Node node){
        if(node==null) return;
        inOrderTraversal(node.right);
        System.out.println(node.data);
        inOrderTraversal(node.left);
    }


    private void preOrderTraversal(Node node){
        if(node==null) return;
        System.out.println(node.data);
        preOrderTraversal(node.right);
        preOrderTraversal(node.left);
    }

    private Node addData(Node node,int data){
        if(node == null ){
            node = new Node(data);
            return node;
        } else if ( data< node.data) {
            node.right = addData(node.right,data);
        }else{
            node.left = addData(node.left,data);
        }
        return node;
    }


}
