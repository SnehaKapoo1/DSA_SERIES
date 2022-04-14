package questions.linkedList;
import java.util.Stack;

public class SumOfTwoLL {

    public static Node sum(Node head1, Node head2){
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        Node curr = head1, curr2 = head2;
        while(curr != null){
            s1.push(curr.data);
            curr = curr.next;
        }

        while(curr2 != null){
            s2.push(curr2.data);
            curr2 = curr2.next;
        }

        Node result = null;
        int carry =0;

        while(!s1.isEmpty() || !s2.isEmpty()){
            int a = 0, b =0;
            if(s1.isEmpty()){
                a = s1.pop();
            }
            if(s2.isEmpty()){
                b = s2.pop();
            }
            int total = a + b + carry;
            Node temp = new Node(total % 10);
            carry = total / 10;

            if(result == null)
                result = temp;
            else{
                temp.next = result;
                result = temp;
            }
        }
        if(carry != 0){
            Node temp = new Node(carry);
            temp.next = result;
            result = temp;
        }
        return result;
    }

    public static void main(String[] args) {
      Node head = new Node(1);
      head.next = new Node(2);
      head.next.next = new Node(3);

      Node head2 = new Node(8);
      head2.next = new Node(9);
      head2.next.next = new Node(8);

      Node res_head = sum(head, head2);
      while(res_head != null){
          System.out.print(res_head.data + " ");
          res_head = res_head.next;
      }

    }
}
