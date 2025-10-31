package problems;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class findduplicatesinintlist {
    public static void main(String[] args) {
        int inputs[] = {2,2,5,6,8,9,9};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<inputs.length;i++){
            if(map.containsKey(inputs[i])){
               map.put(inputs[i],map.get(inputs[i])+1);
            }
            else{
                map.put(inputs[i],1);
            }
        }
        System.out.println(map);
        List<Integer> duplicates = map.entrySet().stream().filter(data->data.getValue()>1).map(key-> key.getKey()).toList();
        System.out.println(duplicates);
    }
}
