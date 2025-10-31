package streams_interview_problems;

import java.sql.SQLOutput;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class find_the_second_highest {
    public static void main(String[] args) {
        List<Integer> input = List.of(10,15,28,65,55);
        int second=3;
        Optional<Integer> data = input.stream().sorted(Comparator.reverseOrder()).skip(second-1).findFirst();
        System.out.println(data.get());
    }


}
