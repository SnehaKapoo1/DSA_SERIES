package tree;

import java.util.HashMap;

public class ConstructBinaryTree {
    static int preIndex =0;
    // Tc :  O(N^2)
    /*static Node cTree(int in[], int []pre, int is, int ie){
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
    }*/

    static HashMap<Integer, Integer> mp = new HashMap<>();
    public static Node buildTree(int[] in, int[] pre, int inStrt, int inEnd)
    {

        if(inStrt > inEnd)
        {
            return null;
        }

        int curr = pre[preIndex++];
        Node tNode;
        tNode = new Node(curr);
        if (inStrt == inEnd)
        {
            return tNode;
        }

        int inIndex = mp.get(curr);

        tNode.left = buildTree(in, pre, inStrt, inIndex - 1);
        tNode.right = buildTree(in, pre, inIndex + 1, inEnd);
        return tNode;
    }

    public static Node buldTreeWrap(int[] in, int[] pre, int len)
    {
        for(int i = 0; i < len; i++)
        {
            mp.put(in[i], i);
        }
        return buildTree(in, pre, 0, len - 1);
    }

    public static void main(String[] args) {
        int inOrder[] = {20, 10, 40, 30, 50};
        int preOrder[] ={10, 20, 30, 40, 50};

       // Node ans = cTree(inOrder, preOrder, 0, inOrder.length-1);
        //System.out.println(ans.key);
        Node eAns = buldTreeWrap(inOrder, preOrder, inOrder.length);
        System.out.println(eAns.key);
    }
}
