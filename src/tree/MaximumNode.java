package tree;

public class MaximumNode {
    static int maxNode(Node root){
        if(root == null)
            return -1;

        return Math.max(root.key, (Math.max(maxNode(root.left), maxNode(root.right))));
    }
}
