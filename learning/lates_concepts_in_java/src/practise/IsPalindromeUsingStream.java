package practise;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IsPalindromeUsingStream {
    public static void main(String[] args) {
      int input[]={10,20,30,40,50};
      int in[]={1,2,0,5,6,7};
        System.out.println(secondhighestnumber(input));
        System.out.println(countoccurenceofeachcharacer("sathish"));
        int out[]=movezerostoend(in);
        for (int data:out) {
            System.out.println(data);
        }
    }
    static Boolean ispalindrome(String input){
        String b=input.toLowerCase();
        return IntStream.range(0,b.length()/2).allMatch(i->b.charAt(i)==b.charAt(b.length()-i-1));
    }
    static int secondhighestnumber(int c[]){
        int min_1=0;
        int min_2=0;
        for(int i=0;i<c.length;i++){
            if(c[i]>min_1){
                min_2=min_1;
                min_1=c[i];
            }
            else if(c[i]<min_1&&c[i]>min_2){
                min_2=c[i];
            }
        }
        return min_2;
    }

    static Map<Object,Long> countoccurenceofeachcharacer(String input){
        return  input.chars().mapToObj(data-> (char) data).collect(Collectors.groupingBy(data->data,Collectors.counting()));
    }
    static int[] movezerostoend(int[] input){
        int first=0;
        for(int i=0;i<input.length;i++){
            if(input[i]!=0){
                int temp=input[i];
                input[i]=input[first];
                input[first]=temp;
                first++;
            }
        }
        return input;
    }
}
