package tree;

import static tree.HeightOfTheBinaryTree.height;
import static tree.Inorder.inorder;
import static tree.LOT_Line_By_Line.printLevelOrder;
import static tree.LOT_Line_By_Line.printLevelOrderMethod2;
import static tree.LevelOrder.lOT;
import static tree.MaximumNode.maxNode;
import static tree.Postorder.postorder;
import static tree.Preorder.preorder;
import static tree.PrintKDistanceNodes.printKDistance;
import static tree.SizeOfBinaryTree.getSize;

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

        /*inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        System.out.println(height(root));
        printKDistance(root, 1);
        System.out.println();

        //level order traversal first approach
        int k = height(root);
        for(int i=0; i<k; i++){
            printKDistance(root, i);
        }
        System.out.println();
        lOT(root); */
        System.out.println();

        printLevelOrder(root);
        System.out.println();
        printLevelOrderMethod2(root);
        System.out.println(getSize(root));
        System.out.println("max node " + maxNode(root));
    }
}
