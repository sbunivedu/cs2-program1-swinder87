public class CharStack
{
  private final int MAX_CAP = 100;
  private int top; //location of top item on the stack
  private char [] s; //The stack

  public CharStack(){
    //POS: top == -1; empty stack
    //TAS: Create an empty stack with a default capacity
    s = new char[MAX_CAP];
    top = -1;
  }

  public void push(char element){
    //PRE: top < (MAX_SIZE - 1) && !full
    //POS: top <exit> == top <entry>+1 &&
    //      s[top<entry>+1] contains element
    //TAS: Increment top, then put element at top.
    top ++;
    s[top] = element;
  }

  public char pop (){
    //PRE: Stack is not empty
    char result = s[top];
    top --; 
    return result; 
                 //POS: Decreases top by one, top item returned
                  //TAS: remove and return the item on the top of the stack
  }

  public boolean isEmpty(){
    if (top == -1){     //POS: Checks to see if stack is empty
      return true;      //TAS: Returns whether or not the stack is empty 
      }else{
        return false;
        }
    }

  public boolean isFull(){
    //POS:Checks to see if stack is full
    //TAS: return whether or not the stack is full
    if(top == MAX_CAP-1){
	return true;
	}else{
	return false;
     }
}

  
  public char peek(){
    return s[top];
    //TAS: returns value at the top of the stack
  }
  
  public String toString(){
  //PRE: There is a stack and theres at least one element
  //POS: Returns string of elements
  //TAS: Return stack contents from left to right from top
  String out = "";
  for (int i = 0; i<s.length; i++){
    out = out + s[i];
  }
  return out;
    }
  }
