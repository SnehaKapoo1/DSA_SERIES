package tree;

public class BTTODLL {
    static Node prev = null;
    static Node binaryTreeToDoublyLinkedList(Node root){
        if(root == null)
            return root;
        Node head = binaryTreeToDoublyLinkedList(root.left);
        if(prev == null)
        {head = root;}
        else{
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        binaryTreeToDoublyLinkedList(root.right);
        return head;
    }
    public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.key+" ");
            curr=curr.right;
        }
    }
}
