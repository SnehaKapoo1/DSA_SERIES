package questions.stack;

import java.util.ArrayDeque;

public class Balanced_Parenthesis {
	
	public static boolean isBalanced(String str) {
		
		ArrayDeque<Character> stack = new ArrayDeque<>();
		
		for(int i=0; i < str.length(); i++) {
			char x = str.charAt(i);
			
			if(x =='(' || x == '{' || x == '[') {
				stack.push(x);
				continue;
			}
			
			if(stack.isEmpty()) return false;
			
			char check;
			switch(x) {
			
			case ')':
				check = stack.pop();
				if(check =='{' || check == '[')
					return false;
				break;
				
			case '}':
				check = stack.pop();
				if(check =='(' || check == '[')
					return false;
				break;
				
			case ']':
				check = stack.pop();
				if(check =='{' || check == '(')
					return false;
				break;
			}	
		}
		
		return (stack.isEmpty());

}

		// Driver code
		public static void main(String[] args)
		{
			String str = "(())";
			
			if(isBalanced(str)) {
				System.out.println("Balanced");
			}else {
				System.out.println("Not Balanced");
			}

		}
	}






















