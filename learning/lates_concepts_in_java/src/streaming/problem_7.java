package streaming;

import java.util.Comparator;
import java.util.List;

public class problem_7 {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple","mango","apple","grapes","bananas","bananas");
        System.out.println(arranginorder(fruits));
        System.out.println(arrangingindescendingorder(fruits));
    }

    public static List<String> arranginorder(List<String> stringdatas){
        return stringdatas.stream().sorted().toList();
    }
    public static List<String> arrangingindescendingorder(List<String> stringdatas){
        return stringdatas.stream().sorted(Comparator.reverseOrder()).toList();
    }

}
