package problems;

import java.util.*;

public class checkgivenwordisanagramornot {
    public static void main(String[] args) {
        String value_A = "dormitory";
        String value_B = "dirty room";
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(anagramgroups(words));
        System.out.println(anagramcheckingfunction(value_A,value_B));
    }
    public static boolean anagramcheckingfunction(String a , String b){
        StringBuilder first = new StringBuilder(a.trim().toLowerCase());
        StringBuilder second = new StringBuilder(b.trim().toLowerCase());
        return first.compareTo(second) > 0;
    }
    public static List<String> anagramgroups(String[] input){
        Map<String,List<String>> modifyingdata = new HashMap<>();
        for(String in:input){
            char[] b = in.toCharArray();
            Arrays.sort(b);
            String key = new String(b);
            modifyingdata.computeIfAbsent(key,k->new ArrayList<>()).add(in);
        }
       List<String> newdata =  modifyingdata.entrySet().stream().flatMap(key-> key.getValue().stream()).toList();
        return newdata;
    }
}
