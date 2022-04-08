package questions.linkedList;

import java.util.HashSet;

public class IntersectionPointOfTwoLL {
    public static int findIntersectPOint(Node h1, Node h2){
        if(h1 == null)
            return -1;
        else if(h2 == null)
            return -1;

        Node curr = h1;
        HashSet<Node> hs = new HashSet<>();
        while(curr != null){
                hs.add(curr);
            curr = curr.next;
        }

        curr = h2;
        while(curr != null){
            if(hs.contains(curr)){
                return curr.data;
            }
        }
        return -1;
    }
}
