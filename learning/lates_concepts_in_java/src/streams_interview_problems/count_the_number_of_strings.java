package streams_interview_problems;

import java.util.ArrayList;
import java.util.List;

public class count_the_number_of_strings {
    public static void main(String[] args) {
        List<String> userdata = List.of("sathish","abishek","aarthi");
        char a = 'a';
        Long count = userdata.stream().filter(data->data.startsWith("a")).count();
        System.out.println(count);
    }
}
