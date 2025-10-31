package problems;

import java.util.stream.IntStream;

public class practise {
    public static void main(String[] args) {
        int data [] = {10,20,14,85,15};
        for(int i=0;i<data.length;i++){
            for(int j=i+1;j<data.length;j++){
                if(data[i]>data[j]){
                    int temp = data[i];
                    data[i]=data[j];
                    data[j]=temp;
                }
            }
        }
        String input = "malayalam";
        String reversed="";
        int output[] = {1,2,3,4,5};
        int sum=0;
        for(int i:output){
            sum+=i;
        }
        System.out.println("one"+sum);
        for(int d:data){
            System.out.println(d);
        }
        for(int i=input.length()-1;i>=0;i--){
            reversed=reversed+input.charAt(i);
        }
        System.out.println(reversed);

        boolean palindromeornot = IntStream.range(0,input.length()/2).allMatch(i->input.charAt(i)==input.charAt(input.length()-i-1));
        System.out.println(palindromeornot);


    }
}
