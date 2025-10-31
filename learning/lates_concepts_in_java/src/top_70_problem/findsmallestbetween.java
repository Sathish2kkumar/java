package top_70_problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class findsmallestbetween {
        public static void main(String[] args) {
        int arr[] = {10,9,8,7,6};
            System.out.println(findthesmallestvaluesamong(arr));
        }
        public static List<Integer> findthesmallestvaluesamong(int data[]){
            List<Integer> userdata = new ArrayList<>();
            for(int i=0;i<data.length;i++){
                int count = 0;
                for(int j=i+1;j<data.length;j++){
                    System.out.println(data[j]);
                    if(data[j]<data[i]){
                        count+=1;
                    }
                }
                userdata.add(count);
            }
            return userdata;
        }
}
