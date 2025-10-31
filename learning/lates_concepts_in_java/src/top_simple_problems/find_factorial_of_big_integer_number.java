package top_simple_problems;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class find_factorial_of_big_integer_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        BigInteger givendata = BigInteger.ONE;
        for(int i=input;i>=2;i--){
            givendata = givendata.multiply(BigInteger.valueOf(i));
        }
        System.out.println(givendata);
        int arr[] ={10,11,12,15,18};
        int first = arr[0];
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>first){
                first+=arr[i];
                end++;
            }
            else{
                first=arr[i];
                start++;
            }
        }
    }
}
