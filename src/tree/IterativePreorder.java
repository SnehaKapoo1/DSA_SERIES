package tree;

import java.util.Stack;

public class IterativePreorder {
    static void iterativePreorder(Node root){
        if(root == null)
            return;
        Stack<Node> s = new Stack<>();
        s.push(root);
        while(!s.isEmpty()){
            Node curr = s.pop();
            System.out.print(curr.key + " ");
            if(curr.right != null)
                s.push(curr.right);
            if(curr.left != null)
                s.push(curr.left);
        }
    }

    static void iterativePreOrderSpaceOptimized(Node root){
        Stack<Node> st = new Stack<>();
        //st.push(root);
        Node curr = root;

        while(curr != null || !st.isEmpty()){
            while(curr != null){
                System.out.print(curr.key + " ");
                if(curr.right != null)
                    st.push(curr.right);
                curr = curr.left;
            }
            if(!st.isEmpty()){
                curr = st.pop();
            }
        }
    }
}
