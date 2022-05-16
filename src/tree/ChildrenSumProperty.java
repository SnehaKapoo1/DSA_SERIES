package tree;

public class ChildrenSumProperty {
    static boolean isCSum(Node root){
        if(root == null) return true;
        if(root.left == null && root.right == null) return true;

        int sum = 0;
        if(root.left != null)
            sum += root.left.key;
        if(root.right != null)
            sum += root.right.key;

        return (root.key == sum && (isCSum(root.left) && isCSum(root.right)));
    }
}
