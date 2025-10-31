package streams_interview_problems;

import java.util.List;
import java.util.stream.Collectors;

public class findthemaximumfromarray {
    public static void main(String[] args) {
        List<Integer> input = List.of(10,20,14,50,86);
        int maximumvalue = input.stream().max(Integer::compare).orElse(0);
        int minimumvalue = input.stream().min(Integer::compare).orElse(0);
        double averagevalue  = input.stream().mapToInt(a->a).average().orElse(0);

    }
}
