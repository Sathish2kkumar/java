package zoho_jpmorgan;

import java.util.Arrays;

public class check_two_string_are_anagram {
    public static void main(String[] args) {
        String a="race";
        String b="care";
        char [] data=a.toCharArray();
        char[] data1=b.toCharArray();
        Arrays.sort(data);
        Arrays.sort(data1);
        Boolean result;
        if(Arrays.equals(data,data1)){
            System.out.println("it is an anagram");
        }
        else {
            System.out.println("it is not an anagram");
        }
    }
}
