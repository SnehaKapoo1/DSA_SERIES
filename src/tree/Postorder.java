package tree;

public class Postorder {
    static void postorder(Node root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.key + " ");
        }
    }
}
