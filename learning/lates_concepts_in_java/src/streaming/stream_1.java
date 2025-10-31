package streaming;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class stream_1 {
    public static void main(String[] args) {
        int a[] ={40,30,50,10,11,50};
        List<Integer> d = List.of(15,20,30,14,500);
        Arrays.stream(a)
                .filter(no->no%2==0)
                .distinct()
                .forEach(System.out::println);
        List<String> variable =  List.of("a");
//        variable.add("a");
//        variable.getLast();
        variable.forEach(System.out::println);
        StringBuilder one = new StringBuilder("sdsd");
        StringBuilder str =new StringBuilder("one");
        System.out.println(str.toString().compareTo(one.toString()));
        System.out.println(str);
        System.out.println("kkk"+maxvalue(d));
        System.out.println("min"+minvalue(d));
        System.out.println("reverseorder"+reverseorder(d));

//        System.out.println(variable);
        //this is called stream the code readability is more flexible and fetches the data fastly the looping runs fastly
        //doesnot stores the values in any of the area just fetches and give we cannot print that one more time because it
        //doesnot store the data

    }
    public static int maxvalue(List<Integer> arr){
        return arr.stream().collect(Collectors.maxBy(Comparator.naturalOrder())).orElse(0);
    }
    public static int minvalue(List<Integer> arr){
        return arr.stream().collect(Collectors.minBy(Comparator.naturalOrder())).orElse(0);
    }
    public static List<Integer> reverseorder(List<Integer> arr){
        return arr.reversed();
    }

}
