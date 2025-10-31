package problems;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streamproblems {
    public static void main(String[] args) {
        List<Integer> data = List.of(10,20,30,40);
        int [] a = {10,20,30,14};
        int [] b = {1,2,3,4};
        int [] c  = IntStream.concat(Arrays.stream(a),Arrays.stream(b)).toArray();

        List<employee> employeeslist = List.of(new employee("sathish",10000,"science"),new employee("suresh",15000,"medical"),new employee("john",8000,"science"),new employee("dae",20000,"engineer"));
        String word  = "capgemini";
        int sum = data.stream().mapToInt(Integer::intValue).sum();
        int max = data.stream().mapToInt(Integer::intValue).max().orElse(0);
        double average = data.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println(sum);
        System.out.println(max);
        System.out.println(average);
        Set<Character> nonrepeatingcharacter = word.chars().mapToObj(u->(char) u).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).
         entrySet().stream().filter(values->values.getValue()==1).map(v->v.getKey()).collect(Collectors.toSet());
        System.out.println(nonrepeatingcharacter);
        int secondhighestsalary = employeeslist.stream().map(employee::getSalaray).sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);
        System.out.println(secondhighestsalary);


    }
}

