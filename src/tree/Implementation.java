package tree;

import static tree.HeightOfTheBinaryTree.height;
import static tree.Inorder.inorder;
import static tree.Postorder.postorder;
import static tree.Preorder.preorder;
import static tree.PrintKDistanceNodes.printKDistance;

class Node{
    int key;
    Node left;
    Node right;
    Node(int k){
        key = k;
    }
}
public class Implementation {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);

        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        System.out.println(height(root));
        printKDistance(root, 1);
    }
}
