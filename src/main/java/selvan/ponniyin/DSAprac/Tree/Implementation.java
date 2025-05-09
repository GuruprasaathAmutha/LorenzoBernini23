package selvan.ponniyin.DSAprac.Tree;

public class Implementation {

    public static void main(String[] args) {
        BinarySearchTree goat = new BinarySearchTree();
        goat.add(5);
        goat.add(2);
        goat.add(3);
        goat.add(13);
        goat.add(23);
        goat.add(1);
        goat.add(0);
        goat.add(-1);
        goat.add(99);


//        goat.PreOrder();
//goat.InOrder();
        goat.PostOrder();
        System.out.println("Checkl");

    }
}
