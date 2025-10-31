package problems;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class checking_given_inputs_are_prime {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        Scanner y = new Scanner(System.in);
        int b = s.nextInt();
        StringBuilder inputs = new StringBuilder();
        Thread a = new Thread(()-> {
            for(int i = 0;i<b;i++){
            System.out.println(i);
            }
        });
        a.start();
//        for(int i = 0;i<b;i++){
//            System.out.println(i);
//        }

//        for(int c = 0;c<b;c++){
//            Scanner d = new Scanner(System.in);
//            int values = d.nextInt();
//            inputs.append(values);
//        }
        System.out.println(inputs);

    }
//    public String gettinginputs(StringBuilder inputs){
//        String a = inputs.toString();
//        StringBuilder d = new StringBuilder();
//        char b [] = a.toCharArray();
//        for(char c :b){
//            if(isprime(c)){
//              d.append(c);
//            }
//        }
//        return d.toString();
//    }

//    public boolean isprime(char f){
//        List a = new Stack();
//    }
}
