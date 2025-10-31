package streams_interview_problems;

import java.util.stream.Collectors;

public class reversethestring {
    public static void main(String[] args) {
        String data = "sathish";
        String userdata =data.chars().mapToObj(a->(char) a).collect(Collectors.collectingAndThen(
                Collectors.toList(),
                list->
                {
                    list.reversed();
                    return list.stream().map(String::valueOf).collect(Collectors.joining());
                }
        ));
    }
}
