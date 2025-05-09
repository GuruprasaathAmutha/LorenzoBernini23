package selvan.ponniyin.DSAprac.Tree;

public class BinarySearchTree<T> {

    Node<T> Root;



    Node<T> add(Node<T> node, T data){
        Node<T> bn = new Node<>(data);
        if(Root == null)  Root =bn;  return Root;



    }
}
