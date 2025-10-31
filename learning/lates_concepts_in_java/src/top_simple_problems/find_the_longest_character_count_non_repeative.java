package top_simple_problems;

import java.util.HashSet;
import java.util.Set;

public class find_the_longest_character_count_non_repeative {
    public static void main(String[] args) {
        String input = "pwwkew";
        Set<Character> out = new HashSet<>();
        int start=0;
        int count=0;
        int totallength=input.length();
        for(int i=0;i<input.length();i++){
            if(out.contains(input.charAt(i))){
               out.remove(input.charAt(i));
               start++;
            }
                out.add(input.charAt(i));
            count=totallength-start;
        }
        System.out.println(count);
    }
}
