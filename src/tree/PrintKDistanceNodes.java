package tree;

public class PrintKDistanceNodes {
    static void printKDistance(Node root, int k){
        if(root == null) return;
        if(k == 0)
            System.out.print(root.key + " ");
        else{
            printKDistance(root.left, k-1);
            printKDistance(root.right, k-1);
        }
    }
}
