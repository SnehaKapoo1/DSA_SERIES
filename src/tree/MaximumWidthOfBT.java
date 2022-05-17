package tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidthOfBT {
    static int maxWidth(Node root){
        if(root == null)
            return 0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int result = 0;

        while(!q.isEmpty()){
            int count = q.size();
            result = Math.max(result, count);
            for(int i =0; i<count; i++){
                Node curr = q.poll();
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
        return result;
    }
}
