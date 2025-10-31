package zoho_problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class two_sum {
    public static void main(String[] args) {
         int b[] = {1,2,4,3,5,6};
         int target=5;
        System.out.println(finding_the_sum(b,target));
    }
    public static int finding_the_sum(int [] a,int target){

        Map<Integer,Integer> data = new HashMap<>();
        Map<Integer,Integer> output = new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(data.containsKey(a[i])){
                output.put(data.get(a[i]),a[i]);
            }
            else{
                int complimentvalue = target-i;
                data.put(complimentvalue,a[i]);
            }
        }
        return output.size();
    }
}
