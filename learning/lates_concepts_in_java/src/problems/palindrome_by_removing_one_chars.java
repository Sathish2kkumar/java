package problems;

import streaming.student;

import java.util.*;
import java.util.stream.Collectors;

public class palindrome_by_removing_one_chars {
    public static void main(String[] args) {
        List<student> stdlist = List.of(new student("sat","doc"),new student("ram","engineer"),new student("suresh","engineer"));
        System.out.println(stdlist.stream().collect(Collectors.groupingBy(student::getName)).entrySet().stream().filter(data->data.getKey().equals("sat")).toList());

        String input  = "abca";
        System.out.println(palinfromeremovingchars(input));
        int arr[] = {3, 1, 4, 4, 5};
        List<Integer> maximumvalueinthelist = List.of(10,20,30,40,50);
        int target =9;
        String nonrepeatingchars = "Sathish";
        String nonrepeatingcharacter = "abcabcbb";
        System.out.println(findnonrepeatingcharacter(nonrepeatingcharacter));
        twosum(arr,target);
        System.out.println(non_repeatingcharacter(nonrepeatingchars));
        sumofdigits(22);
        String data = "capgemini";
        List<Character> chardata = data.chars().mapToObj(d->(char) d).collect(Collectors.groupingBy(a->a,Collectors.counting())).entrySet().stream().filter(c->c.getValue()==1).map(f->f.getKey()).toList();
        System.out.println("onedata"+chardata);

    }
    public static boolean palinfromeremovingchars(String data){
        Boolean d=false;
//        StringBuilder input = new StringBuilder(data);

        for(int i=0;i<data.length();i++){
            StringBuilder input = new StringBuilder(data);
            StringBuilder removingoneelement = input.deleteCharAt(i);
            if(ispalindrome(removingoneelement.toString())){
                System.out.println(removingoneelement);
                d=true;
            }


        }
        return d;
    }
    public static Boolean ispalindrome(String str){
        return str.contentEquals(new StringBuilder(str).reverse());
    }

    public static Set<Integer> twosum(int [] input,int target){
        Map<Integer,Integer> keyvalues = new HashMap<>();
        Set<Integer> values = new HashSet<>();
        for(int i=0;i<input.length;i++){
            Integer valueexiststs = keyvalues.get(input[i]);
            if(valueexiststs!=null){
                values.add(valueexiststs);
                values.add(i);
            }
            else{
                int complementtarget = target-input[i];
                keyvalues.put(complementtarget,i);
            }
        }
        System.out.println(values);
        return values;
    }
    public static Set<Character> non_repeatingcharacter(String data){
        Map<Character,Integer> b = new HashMap<>();
        for(int i=0;i<data.length();i++){
            if(b.containsKey(data.charAt(i))){
                System.out.println(data.charAt(i));
                b.put(data.charAt(i),b.get(data.charAt(i))+1);
            }
            else{
                b.put(data.charAt(i),1);
            }
        }
        System.out.println(b);
        return b.entrySet().stream().filter(key->key.getValue()==1).map(y->y.getKey()).collect(Collectors.toSet());

    }
    public static int findnonrepeatingcharacter(String data){
        int start = 0;
        int end = 0;
        int initialvalue = Math.min(1,data.length());
        Set<Character> list = new HashSet<>();
        while(end<data.length()){
            if(list.contains(data.charAt(end))){
                list.remove(data.charAt(end));
                start++;
            }
            list.add(data.charAt(end));
            end++;
        }
        int count = end-start;
        return Math.max(initialvalue,count);
    }
    public static void sumofdigits(int value){
        int sum=0;
        while(value>0){
            int digit = value%10;
            sum+=digit;
            digit/=10;
        }
        System.out.println(sum);
    }
   public static OptionalDouble sumoflist(List<Integer> input){
        return input.stream().mapToInt(a->a).average();
   }
}
