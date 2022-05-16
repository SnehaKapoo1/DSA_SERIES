package tree;

public class Preorder {
    static void preorder(Node root){
        if(root != null){
            System.out.print(root.key + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
}
