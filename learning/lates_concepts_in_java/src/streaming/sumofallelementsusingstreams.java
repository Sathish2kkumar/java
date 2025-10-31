package streaming;

import java.util.List;

public class sumofallelementsusingstreams {
    public static void main(String[] args) {
        List<String> data= List.of("one","two","three","four");
        List<Integer> intger = List.of(10,20,30,40);
        Long count=data.parallelStream().count();
        System.out.println(count);
        int sum =intger.parallelStream().mapToInt(Integer::intValue).sum();
        System.out.println("kmkmkmkm"+sum);
    }
}
