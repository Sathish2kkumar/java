package streaming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class findiduplicates_in_list {
    public static void main(String[] args){
        List<Integer> data = List.of(10,20,20,40,41,45,20);
        List<Integer> c = data.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(a->a.getValue()>1).map(b-> Math.toIntExact(b.getKey())).toList();
        System.out.println(c);
        Optional<Integer> secondhighestnumber = data.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println("second"+secondhighestnumber);
    }
}
