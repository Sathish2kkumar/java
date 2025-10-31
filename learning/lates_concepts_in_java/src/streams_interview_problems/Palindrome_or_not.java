package streams_interview_problems;

import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Palindrome_or_not {
    public static void main(String[] args) {
        String s = "lil";
        Boolean palindrome=s.chars().mapToObj(a->(char) a).collect(Collectors.collectingAndThen(
                Collectors.toList(),
                list->{
                    Collections.reverse(list);
                     return list.stream().map(String::valueOf).collect(Collectors.joining()).equals(s);
                }
        ));
        String re = s.chars()
                .mapToObj(c -> String.valueOf((char) c)) // convert int → char → String
                .collect(Collectors.collectingAndThen(Collectors.joining(),
                        str -> new StringBuilder(str).reverse().toString()));
        Boolean result= IntStream.range(0,s.length()/2)
                        .allMatch(i->s.charAt(i)==s.charAt(s.length()-i-1));
        System.out.println(result+" result");
        System.out.println(palindrome);
    }
}
