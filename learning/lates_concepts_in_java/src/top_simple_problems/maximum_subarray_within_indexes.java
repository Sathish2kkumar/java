package top_simple_problems;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class maximum_subarray_within_indexes {
    public static void main(String[] args) {
        int input[] = {-2, 1, -3, 4, -1, 2};
        int current_max = input[0];
        int global_max = input[0];
        int s = 0;
        int start = 0;
        int end = 0;
        for (int i = 1; i < input.length; i++) {
            if (input[i] > current_max + input[i]) {
                current_max = input[i];
                s = i;
            } else {
                current_max += input[i];
            }

        }
        System.out.println(List.of(global_max, start, end));
    }
}
