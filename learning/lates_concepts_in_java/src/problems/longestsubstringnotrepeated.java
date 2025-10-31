package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class longestsubstringnotrepeated {
    public static void main(String[] args) {
        String a = "((()))";
        int open = 0;
        int close = 0;
        Map<Character
                ,Integer> data = new HashMap<>();
        for(char b:a.toCharArray()){
            if(b=='('){
                data.put(b,0);
            }
            if(b==')'){
              if(data.get('(')==0){
                  data.put('(',1);
              }
            }
        }
        System.out.println(data);

    }
}
