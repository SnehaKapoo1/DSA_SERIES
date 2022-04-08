package questions.linkedList;

public class RemoveDuplicateFromShortedLL {
    public static Node removeDupli(Node head){
        Node curr = head;
        if(curr == null)
            return null;
        while(curr.next != null){
            if(curr.data == curr.next.data)
                curr.next = curr.next.next;
            else
                curr = curr.next;
        }
        return head;
    }

}
