package zoho_jpmorgan;

import java.util.Arrays;

public class anagram {
    public static Boolean isanagram(){
        String first ="apple";
        String second="lappe";
        char a[]=first.toLowerCase().toCharArray();
        char b[]=second.toLowerCase().toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
    }

    public static void main(String[] args) {
        System.out.println(isanagram());
    }
 }
