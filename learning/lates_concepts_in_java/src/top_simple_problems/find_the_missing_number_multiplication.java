package top_simple_problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class find_the_missing_number_multiplication {
    public static void main(String[] args) {
        int data [] = {3,6,6,12,12,18};
        List<Integer> converteddata = new ArrayList<>();
        List<Integer> expectedoutput = new ArrayList<>();
        for(int i=0;i<data.length;i++){
            if(!converteddata.contains(data[i])){
                converteddata.add(data[i]);
            }

        }
        int actualsum=converteddata.stream().mapToInt(a->a).sum();
        int expectedsum=0;
        for(int i=1;i<= data.length;i++){
              int output = 3*i;
              expectedoutput.add(output);
              expectedsum+=3*i;
//              System.out.println(expectedsum);

        }
        List<Integer> missinnumber = expectedoutput.stream().filter(i->!converteddata.contains(i)).toList();
        System.out.println(missinnumber);
    }
}
