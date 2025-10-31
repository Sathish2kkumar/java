package slinding_window;

import java.util.HashSet;
import java.util.Set;

public class problem_1_N {
    public static void main(String[] args) {
        int [] userinput = {1,2,3,5,6,7,8};
        int target = 5;
        System.out.println(gettingdata(userinput,target));
    }
    public static Set<Integer> gettingdata(int in[],int target){
        Set<Integer> sumvalues = new HashSet<>();
        for(int i=0;i<in.length;i++){
            sumvalues=new HashSet<>();
            int addittionval=0;
            for(int j=i;j<target+i;j++){
                addittionval+=in[j];
                sumvalues.add(j);
                if(addittionval==target){
                    return sumvalues;
                }

            }

        }
        return sumvalues;

    }
}
