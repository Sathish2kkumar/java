package com.example.testimplementation;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class problems {
    public static void main(String[] args) {
        int one[]={10,20,15,14,80};
        int ouput = maximumnumbers(one);
        System.out.println(ouput);
        int data1[] = {1,2,3,4,5};
        int data2[] = {2,8,7,5,2};
        Arrays.concat

    }
    public static int maximumnumbers(int data[]){
        int max=0;
        for(int i=0;i<data.length;i++){
            if(data[i]>max){
                max=data[i];
            }
        }
        return max;
    }
    public static Boolean ispalindrome(String input){
         return IntStream.range(0,input.length()/2).allMatch(i->input.charAt(i)==input.charAt(input.length()-i-1));
    }
}
