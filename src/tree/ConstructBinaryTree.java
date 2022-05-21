package tree;

public class ConstructBinaryTree {
    static int preIndex =0;
    static Node cTree(int in[], int []pre, int is, int ie){
        if(is > ie) return null;
        Node root = new Node(pre[preIndex++]);

        if(is == ie)
            return root;

        int inIndex =is;
        for(int i=is; i<=ie; i++){
            if(in[i] == root.key){
                inIndex = i;
                break;
            }
        }

        root.left = cTree(in, pre, is, inIndex-1);
        root.right = cTree(in, pre, inIndex+1, ie);

        return root;
    }

    public static void main(String[] args) {
        int inOrder[] = {20, 10, 40, 30, 50};
        int preOrder[] ={10, 20, 30, 40, 50};

        Node ans = cTree(inOrder, preOrder, 0, inOrder.length-1);
        System.out.println(ans.key);
    }
}
