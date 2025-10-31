package streaming;

import java.util.List;
import java.util.stream.Stream;

public class mergintwolistsusingparallelstream {
    public static void main(String[] args) {
        List<Integer> integers= List.of(10,20,50);
        List<Integer> integers2 = List.of(60,70,80);
        System.out.println(merge(integers,integers2));
    }
    public static List<Integer> merge(List<Integer> list1, List<Integer> list2){
        return Stream.concat(list1.parallelStream(),list2.parallelStream()).toList();
    }
}
