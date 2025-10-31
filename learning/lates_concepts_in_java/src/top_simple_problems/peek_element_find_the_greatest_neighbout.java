package top_simple_problems;

import java.util.ArrayList;
import java.util.List;

public class peek_element_find_the_greatest_neighbout {
    public static void main(String[] args) {
        int[] b = {10, 11, 9, 14, 18};
        List<Integer> neighbourData = new ArrayList<>();
        for (int i = 1; i < b.length - 1; i++) {
            if (b[i] > b[i-1] && b[i] > b[i+1]) {
                neighbourData.add(b[i]);
            }
        }
        System.out.println(neighbourData);
    }
}
