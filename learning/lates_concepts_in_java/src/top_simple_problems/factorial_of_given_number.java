package top_simple_problems;

public class factorial_of_given_number {
    public static void main(String[] args) {
        int givenumber=5;
        int factorial=5;
        for(int i=givenumber-1;i>0;i--){
            factorial*=i;
        }
        System.out.println(factorial);
    }
}
