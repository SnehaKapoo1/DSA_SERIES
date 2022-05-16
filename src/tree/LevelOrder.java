package tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {
    static void lOT(Node root){
        if(root == null)
            return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            Node curr = queue.poll();
            System.out.print(curr.key + " ");
            if(curr.left != null)
                queue.add(curr.left);
            if(curr.right != null)
                queue.add(curr.right);
        }
    }
}
