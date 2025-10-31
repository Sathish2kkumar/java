package top_simple_problems;

import java.util.ArrayList;
import java.util.List;

public class find_the_element_that_are_smaller_than_current_indices {
    public static void main(String[] args) {
        int a []= {10,9,8,11,15,1,48,58};
        int count = 0;
        List<Integer> fidingsmallerelement = new ArrayList<>();
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    count++;
                }
            }
            fidingsmallerelement.add(count);
            count=0;
        }
        System.out.println(fidingsmallerelement);
    }
}
