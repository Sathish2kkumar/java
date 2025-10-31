package streaming;

import java.util.Collections;
import java.util.stream.Collectors;

public class reversethestring {
    public static void main(String[] args) {
        String a = "sathish";
        String reversedstring = a.chars().mapToObj(b->(char) b).collect(Collectors.collectingAndThen(
                Collectors.toList(),
                list-> {
                    System.out.println(list);
                    Collections.reverse(list);
                    return list.stream().map(String::valueOf).collect(Collectors.joining());
                }
        ));
        System.out.println("onedata    "+reversedstring);

    }
}
