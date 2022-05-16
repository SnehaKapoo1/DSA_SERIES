package tree;

import java.util.LinkedList;
import java.util.Queue;

public class LOT_Line_By_Line {
    static void printLevelOrder(Node root){
        if (root == null)
            return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while(queue.size() > 1){
            Node curr = queue.poll();
            if(curr ==  null){
                System.out.println();
                queue.add(null);
                continue;
            }

            System.out.print(curr.key + " ");
            if(curr.left != null)
                queue.add(curr.left);
            if(curr.right != null)
                queue.add(curr.right);
        }
    }

    static void printLevelOrderMethod2(Node root){
        if (root == null)
            return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int count = queue.size();
            for(int i=0; i< count; i++){
                Node curr = queue.poll();
                System.out.print(curr.key + " ");
                if(curr.left != null)
                    queue.add(curr.left);
                if(curr.right != null)
                    queue.add(curr.right);
            }
            System.out.println();
        }
    }
}
