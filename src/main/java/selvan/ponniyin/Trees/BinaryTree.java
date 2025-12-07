package selvan.ponniyin.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree {
    TreeNode root;

    Queue<Integer> levelOrder = new LinkedList<>();

        void inOrderTraversal(TreeNode root){
            if(root==null) return;
            inOrderTraversal(root.left);
            System.out.println(root.data);
            inOrderTraversal(root.right);
        }


        void preOrderTraversal(TreeNode root){
            if(root==null) return;
            System.out.println(root.data);
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }

        void postOrderTraversal(TreeNode root){
            if(root==null) return;
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.println(root.data);
        }

        void levelOrderTraversal(TreeNode root){
            if(root==null ) return;

            Queue<TreeNode> levelQueue = new LinkedList<>();
            List<List<Integer>> levelOrder = new ArrayList<>();

            levelQueue.offer(root);
            while(!levelQueue.isEmpty()){
                int level = levelQueue.size();
                List<Integer> levelList = new ArrayList<>();
                for(int i=0;i<level;i++){
                    if(levelQueue.peek().left!=null){
                        levelQueue.offer(levelQueue.peek().left);
                    }
                    if (levelQueue.peek().right!=null) {
                        levelQueue.offer(levelQueue.peek().right);
                    }
                    levelList.add(levelQueue.poll().data);
                }

                levelOrder.add(levelList);
            }

            int i=1;
            for(List<Integer> level : levelOrder){
                System.out.println("For level "+i++);
                for(int j: level){
                    System.out.print(j+ " ");
                }
                System.out.println();
            }
        }
}
