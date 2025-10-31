package top_simple_problems;

import java.util.ArrayList;
import java.util.List;

public class product_of_array_except_self {
    public static void main(String[] args) {
        int input[] ={1,2,3,4};
        List<Integer> sumofvalues = new ArrayList<>();
        for(int i=0;i<input.length;i++){
            int sum=1;
         for(int j=0;j<input.length;j++){
             sum*=input[j];
         }
         sum-=input[i];
         sumofvalues.add(sum);
        }
        System.out.println(sumofvalues);
    }
}
