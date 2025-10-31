package top_simple_problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class iterating_given_number_as_palindrome {
    public static void main(String[] args) {
        int range=50;
        for(int i=22;i<range;i++){
            int t=i;
            String original=String.valueOf(i);
            String reversed=new StringBuilder(original).reverse().toString();
            if(original.equals(reversed)){
                System.out.println("palindrome"+i);
            }
        }
    }
}
