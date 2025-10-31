package slidingwindowproblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class twosum {
    public static void main(String[] args) {
         int num[] = {2,3,1,2,4,3};
         int target = 7;
        System.out.println(data(num,target));
    }
    public static List<Integer> data(int[] data,int target){
        Map<Integer,Integer> position = new HashMap<>();
        List<Integer> newdata = new ArrayList<>();
        for(int i=0;i<data.length;i++){
         if(position.containsKey(data[i])){
             newdata.add(position.get(data[i]));
             newdata.add(i);
         }
         else{
             int complement =target-data[i];
             position.put(complement,i);
         }

        }
        return newdata;
    }
}
