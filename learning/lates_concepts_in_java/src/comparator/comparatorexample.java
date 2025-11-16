package comparator;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparatorexample implements Comparable<Integer> {
    Integer value;
    public comparatorexample(int value) {

        this.value = value;
    }
    public int compareTo(comparatorexample other) {
        return Integer.compare(this.value, other.value);
    }
    public static void main(String[] args) {
        List<Integer> a = new java.util.ArrayList<>(List.of(10, 5, 18, 7));
        Comparator<Integer> comp = (a1, b) -> {
            if(a1>b){
                return 1;
            }
            else{
                return -1;
            }
        };
        Collections.sort(a,comp);
        a.stream().peek(s-> System.out.println(s)).toList();
    }
    @Override
    public int compareTo(Integer o) {
        return 0;
    }
}
