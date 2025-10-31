package problems;

import java.util.Stack;

public class paranthesisfunction {
    public static void main(String[] args) {
        String inputvalue = "[{()}]";
        System.out.println(isvalid(inputvalue));;
    }

    public static Boolean isvalid(String data){
        char [] inputdata = data.toCharArray();
        if(inputdata.length==0){
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for(char b:inputdata){
          if(b=='('||b=='{'||b=='['){
              stack.add(b);
          }
          if(b=='}'){
              if(stack.isEmpty()||stack.pop()!='{')
                  return false;
          }
          if(b==')'){
              if(stack.isEmpty()||stack.pop()!='(')
                  return false;
          }
          if(b==']'){
              if(stack.isEmpty()||stack.pop()!='[')
                  return false;
          }
        }
        return stack.isEmpty();
    }
}
