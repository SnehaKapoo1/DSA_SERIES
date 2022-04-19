package questions.stack;

import java.util.Stack;

public class InfixToPrefix {
       static int precedence(char c){
            switch (c){

                case '+' :
                case  '-' :
                    return 1;

                case '*' :
                case  '/' :
                    return 2;

                case '^' :
                    return 3;
            }
            return -1;
        }

        static String infixToPreFixExp(String s){
            String result = new String("");
            Stack<Character> stack = new Stack<>();

            for(int i=s.length()-1; i>=0; i--){
                char c = s.charAt(i);

                if(Character.isLetterOrDigit(c))
                    result += c;

                else if(c == '(')
                    stack.push(c);

                else if(c == ')'){
                    while (!stack.isEmpty() && stack.peek() != '(')
                        result +=stack.pop();

                    stack.pop();
                }

                else {
                    while(!stack.isEmpty() && precedence(c) <= precedence(stack.peek())){
                        result += stack.pop();
                    }
                    stack.push(c);
                }
            }
            while (!stack.isEmpty()){
                if(stack.peek() == '(')
                    return "Invalid Expression";
                result += stack.pop();
            }
            String revAns = "";
            for(int i = result.length()-1; i>=0; i--){
                revAns += result.charAt(i);
            }
            return revAns;
        }
        public static void main(String[] args)
        {
            // String exp = "a+b*(c^d-e)^(f+g*h)-i";
            String exp = "a+b*c";
            System.out.println(infixToPreFixExp(exp));
        }
    }

