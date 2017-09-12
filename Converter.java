

import java.util.Scanner;

public class Converter extends ConverterVariables{
   public static void main(String [] args) {
       
        CharStack stack = new CharStack();
        Scanner scan = new Scanner(System.in);
        
        char c;
   
    System.out.println("Please input your infix expression: ");
      String infix = scan.nextLine();
      StringBuffer postfix = new StringBuffer(infix.length());
    
    for(int i=0; i<infix.length(); i++){
      c = infix.charAt(i);
      
      if(isOperand(c)){
          postfix.append(c);
      } else if (c == '(') {
          stack.push(c);
            
      }else if (c == ')') {                                 // If the scanned character is an ‘)’, pop and output from the stack
          while (stack.peek() != '(') {                     // until an ‘(‘ is encountered.
              postfix.append(stack.pop());
          }
          stack.pop();
      }
      else if (isOperator(c)) // operator encountered
            {
                while (!stack.isEmpty() &&
                  isOperator(stack.peek()) && 
                  getPrecedence(c) <= getPrecedence(stack.peek())) {
                    postfix.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }
        System.out.println(postfix);
    }
    
    
}//converter