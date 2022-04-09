package questions.linkedList;

import java.util.HashSet;

public class IntersectionPointOfTwoLL {
    // TC: O(M+N)
    //SC: O(N)
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

    public static Node getIntersectionPoint(Node headA, Node headB){
        int c1 = 0, c2 =0;

        Node ch1 = headA;
        while(ch1 != null){
            c1++;
            ch1 = ch1.next;
        }

        Node ch2 = headB;
        while(ch2 != null){
            c2++;
            ch2 = ch2.next;
        }

        int d = Math.abs(c1 - c2);

        if(c1 > c2){
            Node curr1 = headA;
            for(int i=0; i<d; i++){
                curr1 = curr1.next;
            }

            Node curr2 = headB;
            while(curr1 != null && curr2 != null){
                if(curr1 == curr2){
                    return curr1;
                }
                curr1 = curr1.next;
                curr2 = curr2.next;
            }

        } else{
           Node curr1 = headB;
            for(int i=0; i<d; i++){
                curr1 = curr1.next;
            }

           Node curr2 = headA;
            while(curr1 != null && curr2 != null){
                if(curr1 == curr2){
                    return curr1;
                }
                curr1 = curr1.next;
                curr2 = curr2.next;
            }
        }

        return null;
    }

    public static void main(String[] args) {

    }
}
