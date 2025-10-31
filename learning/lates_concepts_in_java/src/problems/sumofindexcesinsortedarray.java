package problems;

import java.util.ArrayList;
import java.util.List;

public class sumofindexcesinsortedarray {
    public static void main(String[] args) {
        int data[] = {1,2,3,4,5};
        System.out.println(gettingthetarget(data,10));
    }

    public static List<Integer> gettingthetarget(int [] data,int target){
        int start=0;
        int end = data.length-1;
        List<Integer> listdata = new ArrayList<>();
        while (start<end){
            int sumdata = data[start]+data[end];
            if(sumdata==target){
                listdata.add(data[start]);
                listdata.add(data[end]);
                break;
            } else if (sumdata<target) {
                start++;

            }
            else{
                end--;
            }
        }
        return listdata;
    }
}
