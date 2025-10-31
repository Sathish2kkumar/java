package top_70_problem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class find_duplicate_values {
    public static void main(String[] args) {
        String input = "sathish";
        System.out.println(gettingduplicatevalue(input));
    }
    public static Set<Character> gettingduplicatevalue(String data){
        Map<Character,Integer> mapdata = new HashMap<>();
        Set<Character> duplicatedata = new HashSet<>();
        for(int i=0;i<data.length();i++){
            if(mapdata.containsKey(data.charAt(i))){
                mapdata.put(data.charAt(i),mapdata.get(data.charAt(i))+1);            }
            else {
                mapdata.put(data.charAt(i),1);
            }
        }
       duplicatedata.addAll(mapdata.entrySet().stream().filter(d->d.getValue()>1).map(v->v.getKey()).collect(Collectors.toSet()));
        return duplicatedata;
    }
}
