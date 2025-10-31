package top_simple_problems;

import java.util.Stack;

public class valid_parenthesis {
    public static void main(String[] args) {
        String a = "{([])}";
        Stack<Character> c = new Stack<>();
        boolean isvalidparenthesis=true;
        for(char b:a.toCharArray()){
            if(b=='{'||b=='('||b=='['){
                c.add(b);
            }else{
                if(c.isEmpty()){
                    isvalidparenthesis=false;
                }
            }
            char pop_value = c.pop();
            if(pop_value=='{'&&b!='}'||pop_value=='['&&b!=']'||pop_value=='('&&b!=')'){
                isvalidparenthesis=false;
                break;
            }
        }
        System.out.println(isvalidparenthesis);
    }




}
