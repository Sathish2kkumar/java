package streaming;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class countoccurencesallelementinarray {
    public static void main(String[] args) {
        List<String> userdata = List.of("one","two","three","three");
        List<Integer> countofthedata = userdata.parallelStream().map(data->data.toCharArray().length).toList();
        System.out.println("countofthedata"+countofthedata);
        Map<String,Long> occurencescount = userdata.parallelStream().collect(Collectors.groupingByConcurrent(data->data,Collectors.counting()));
        System.out.println("concurrentdata"+occurencescount);
    }

}
