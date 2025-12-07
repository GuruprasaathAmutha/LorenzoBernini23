package selvan.ponniyin.Trees;

import java.util.Objects;
import java.util.Stack;

public class TreesExecution {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root=new TreeNode(3);
        binaryTree.root.left= new TreeNode(1);
        binaryTree.root.right= new TreeNode(4);

        binaryTree.root.left.left= new TreeNode(3);
        binaryTree.root.left.right= new TreeNode();

        binaryTree.root.right.left= new TreeNode(1);
        binaryTree.root.right.right= new TreeNode(5);


        BinaryTree binaryTree1 = new BinaryTree();
        binaryTree1.root=new TreeNode(1);
        binaryTree1.root.left= new TreeNode(2);
        binaryTree1.root.right= new TreeNode(200);

//        binaryTree.levelOrderTraversal(binaryTree.root);
//        System.out.println(leafSimilar(binaryTree.root,binaryTree1.root));

        System.out.println(goodNodes(binaryTree.root));


    }

        static int  count=0;
    public static int goodNodes(TreeNode root) {
        if(root == null) return 0;
        if(root.left ==null && root.right==null) return 1;

        return goodNodes(root,count,root.data);
    }

    public static int goodNodes(TreeNode root,int count,int rootval){
        if(root == null ) return 0;
        if(root.data >= rootval) count++;
        goodNodes(root.left,count, Math.max( root.data,rootval));
        goodNodes(root.right,count,Math.max( root.data,rootval));

        return count;
    }





    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        Stack<Integer> r1 = new Stack<Integer>();
        Stack<Integer> r2 = new Stack<Integer>();
        findLeaves(root1,r1);
        findLeaves(root2,r2);

        if(r1.size()==r2.size()){
            while(!r1.isEmpty()){
                if(!Objects.equals(r1.pop(), r2.pop())){
                    return false;
                }
            }
        }else{
            return false;
        }
        return true;
    }


    public static void findLeaves(TreeNode root,Stack<Integer> r){
        if(root==null) return;
        if(root.left==null && root.right==null){
            r.push(root.data);
            return;
        }
        findLeaves(root.left,r);
        findLeaves(root.right,r);
    }
}
