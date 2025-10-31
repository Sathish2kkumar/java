package top_70_problem;

import java.util.*;
import java.util.stream.Collectors;

public class findthemissingnumber {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 5, 6, 7, 8, 9, 10};
        List<Integer> convertingtolist =  Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.toList());
        Set<Integer> userdata = new HashSet<>();
        for (int i = 1; i <= Arrays.stream(numbers).max().orElse(0); i++) {
            userdata.add(i);
        }
        System.out.println(userdata.stream().filter(u -> !convertingtolist.contains(u)).toList());
    }
}
