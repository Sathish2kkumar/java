package streams_interview_problems;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Remove_duplicates_from_a_list {
    public static void main(String[] args) {
        List<Integer> data = List.of(10,20,10,20,11);
        List<Integer> duplicates = data.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(user->user.getValue()>1).map(b->b.getKey()).toList();
        System.out.println("duplicatesdatas"+duplicates);
    }
}
