package top_simple_problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class two_sum {
    public static void main(String[] args) {
        int a [] ={2,5,8,10,9};
        int target = 1;
        Map<Integer,Integer> complimentdata = new HashMap<>();
        List<Integer> output = new ArrayList<>();
        for(int i=0;i<a.length;i++){
            Integer complement = complimentdata.get(a[i]);
            if(complement!=null){
                output.add(complimentdata.get(a[i]));
                output.add(i);
            }
            int targetcloser = target-a[i];
            complimentdata.put(targetcloser,i);
        }
        System.out.println(output);
    }
}
