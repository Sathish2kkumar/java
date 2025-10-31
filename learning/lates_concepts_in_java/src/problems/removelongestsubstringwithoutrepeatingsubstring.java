package problems;

import java.util.HashSet;
import java.util.Set;

public class removelongestsubstringwithoutrepeatingsubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
    public static int lengthOfLongestSubstring(String s) {
     int start = 0;
     int end=0;
     int maxlength=Math.min(s.length(),1);
     Set<Character> charsvalue = new HashSet<>();
     while(end<s.length()){
         while(charsvalue.contains(s.charAt(end))){
             charsvalue.remove(s.charAt(start));
             start++;
         }
         charsvalue.add(s.charAt(end));
         end++;
         int count = end-start;
         maxlength=Math.max(maxlength,count);
     }
     return maxlength;
    }
}
