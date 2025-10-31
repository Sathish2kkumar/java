package problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class non_repeating_chars {
    public static void main(String[] args) {
        System.out.println(nonrepeatingcharacter("sathish"));
    }
    public static Set<Character> nonrepeatingcharacter(String str){
        Set<Character> chardata = new HashSet<>();
        Map<Character,Integer> data = new HashMap<>();
        for(int i=0;i<str.length();i++){

            if(data.containsKey(str.charAt(i))){
                data.put(str.charAt(i),data.get(str.charAt(i))+1);
            }
            else{
                data.put(str.charAt(i),1);
            }
        }
        chardata.addAll(data.entrySet().stream().filter(users->users.getValue()==1).map(keyvalue->keyvalue.getKey()).toList());
        return chardata;
    }
}
