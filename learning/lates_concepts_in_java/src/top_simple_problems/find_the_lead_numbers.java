package top_simple_problems;

import java.util.ArrayList;
import java.util.List;

public class find_the_lead_numbers {
    public static void main(String[] args) {
        int input[] = {8,2,5,4,3};
        List<Integer> leadingcount=new ArrayList<>();
        for(int i=0;i<input.length;i++){
            int count=0;
            for(int j=0;j<input.length;j++){
                if(input[j]<input[i]){
                    count++;
                }
            }
            leadingcount.add(count);
        }
        System.out.println(leadingcount);
    }
}
