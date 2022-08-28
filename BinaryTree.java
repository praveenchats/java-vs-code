import java.util.*;

public class BinaryTree{


    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTreetree{
        static int idx = -1;
        public static Node buildTree(int Nodes[]){
            idx++;
            if(Nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(Nodes[idx]);
            newNode.left = buildTree(Nodes);
            newNode.right = buildTree(Nodes);
            return newNode;
        }
    }

    public static void main(String args[]){
        int Nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTreetree tree = new BinaryTreetree();
        Node root = tree.buildTree(Nodes);
        System.out.println(root.data);
    }
}