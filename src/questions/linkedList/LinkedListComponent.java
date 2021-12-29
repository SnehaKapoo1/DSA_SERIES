package questions.linkedList;

import java.util.HashSet;
class ListNode {
	     int val;
	     ListNode next;
	     ListNode() {
	    	 
	     }
	     ListNode(int val) 
	     { 
	    	 this.val = val; 
	    	 
	     }
	     ListNode(int val, ListNode next)
	     {
	    	 this.val = val; 
	         this.next = next; 
	     }
	   }

public class LinkedListComponent {
	
	 public static int numComponents(ListNode head, int[] nums) {
	        
	        HashSet<Integer> hs = new HashSet<>();
	        int count =0;
	        ListNode curr = head;
	        
	        for(int i=0; i<nums.length; i++){
	            hs.add(nums[i]);
	        }
	        
	        while(curr!=null){
	            if(hs.contains(curr.val)){
	                count++;
	                hs.remove(curr.val);
	                
	                ListNode nextNode = curr.next;
	                while(nextNode!=null && hs.size() != 0){
	                    if(hs.contains(nextNode.val)){
	                        hs.remove(nextNode.val);
	                        nextNode = nextNode.next;
	                        continue;
	                    }
	                    else
	                    {
	                        break;
	                    }
	                }
	            }
	            
	            curr = curr.next;
	        }  
	       return count; 
	    }

	public static void main(String[] args) {
		ListNode head = new ListNode(0);
		head.next = new ListNode(1);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(4);
		
		int nums[] = { 0,3,1,4};
		
		System.out.println(numComponents(head, nums));

	}
}

























