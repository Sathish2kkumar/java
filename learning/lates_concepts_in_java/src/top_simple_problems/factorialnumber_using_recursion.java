package top_simple_problems;

public class factorialnumber_using_recursion {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static int factorial(int input){
        if (input == 0 || input == 1) {
            return 1;
        }
        return input*factorial(input-1);
    }
}
