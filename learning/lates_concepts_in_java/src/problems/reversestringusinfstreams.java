package problems;

import java.util.Scanner;
import java.util.stream.Collectors;

public class reversestringusinfstreams {
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        String a = b.nextLine();
        System.out.println(reversestring(a));
    }

    public static String reversestring(String a){
           return a.chars().mapToObj(data-> (char) data).collect(Collectors.collectingAndThen(
                   Collectors.toList(),
                   list ->{
                       java.util.Collections.reverse(list);
                       return list.stream()
                               .map(String::valueOf)
                               .collect(Collectors.joining());
                   }
           ));
    }
}
