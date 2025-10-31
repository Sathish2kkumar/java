package problems;

import java.util.Scanner;
import java.util.Stack;

public class paranthesis {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        String a = y.nextLine();
        char t [] = a.toCharArray();
        int sum=0;
        for(char u : t){
            if(u=='('){
              sum+=1;
            }
            else if(u==')'&&u>0){
                sum-=1;
            }
        }
        System.out.println(sum);
    }
    public static Boolean parenthesisproblem(String input){
        Stack<Character> inputdatagiven = new Stack<>();
        if(input.length()==0||input.length()%2!=0){
            return false;
        }
         return false;
    }
}
