package top_simple_problems;

public class maximum_of_subarray {
    public static void main(String[] args) {
        int input [] = {2, 3, -2, 4};
        int maximumvalue = input[0];
        int minimumvalue = input[0];
        int globalvalue = input[0];
        for(int i=1;i<input.length;i++){
            int temmaxvalue = maximumvalue;
            maximumvalue = Math.max(input[i],Math.max(maximumvalue*input[i],minimumvalue*input[i]));
            minimumvalue = Math.min(input[i],Math.min(input[i]*temmaxvalue,input[i]*minimumvalue));
            globalvalue = Math.max(globalvalue,maximumvalue);
        }
        System.out.println(globalvalue);
    }
}
