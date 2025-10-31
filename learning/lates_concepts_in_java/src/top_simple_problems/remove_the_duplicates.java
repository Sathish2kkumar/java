package top_simple_problems;

import java.util.HashMap;
import java.util.Map;

public class remove_the_duplicates {
    public static void main(String[] args) {
        int nums[]={1,1,2,2,3,3,4,4,5};
        Map<Integer,Integer> data = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(data.containsKey(nums[i])){
                data.put(nums[i],data.get(nums[i])+1);
            }
            else{
                data.put(nums[i],1);
            }

        }
        int user = data.entrySet().stream().filter(one->one.getValue()==1).map(i->i.getKey()).findFirst().orElse(-1);
        System.out.println(user);
    }
}
