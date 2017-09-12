

public class ConverterVariables{
  
    public static boolean isOperand(char c){
    if(
      (c>='a' && c<='z') ||
      (c>='A' && c<='Z') ||
      (c>='0' && c<='9')){
        return true;
      }else{
        return false;
      }
  }

  public static boolean isOperator(char c){
    return c=='+' || c=='-' || c=='*' || c=='/';
  }

  public static int getPrecedence(char ch) {
        switch (ch) {
        
        case '-':
            return 1;

        case '+':
            return 1;
        
        case '/':
            return 2;
            
        case '*':
            return 2;
        }
        return -1;
    }
  
  }//class

