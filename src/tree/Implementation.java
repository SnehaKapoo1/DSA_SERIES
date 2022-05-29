package tree;

import static tree.Inorder.inorder;
import static tree.IterativeInorder.iterativeInorder;
import static tree.IterativePreorder.iterativePreOrderSpaceOptimized;
import static tree.IterativePreorder.iterativePreorder;
import static tree.Preorder.preorder;
import static tree.PrintSpiral.printSpiralMethod1;
import static tree.PrintSpiral.printSpiralMethod2;

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
        Node root=new Node(10);
        root.left=new Node(5);
        root.right=new Node(20);
        root.right.left=new Node(30);
        root.right.right=new Node(35);

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
    /*    System.out.println();

        printLevelOrder(root);
        System.out.println();
        printLevelOrderMethod2(root);
        System.out.println(getSize(root));
        System.out.println("max node " + maxNode(root));
        System.out.println(isCSum(root));
        System.out.println(isBalancedNaiveSol(root));
        System.out.println(isBalancedEfficientSol(root));
        System.out.println(maxWidth(root));
        Node head=binaryTreeToDoublyLinkedList(root);
        printlist(head);*/

        inorder(root);
        System.out.println();
        iterativeInorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        iterativePreorder(root);
        System.out.println();
        iterativePreOrderSpaceOptimized(root);
        System.out.println();
        printSpiralMethod1(root);
        System.out.println();
        printSpiralMethod2(root);
    }
}
