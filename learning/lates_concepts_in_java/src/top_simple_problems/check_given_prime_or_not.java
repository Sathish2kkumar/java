package top_simple_problems;

public class check_given_prime_or_not {
    public static void main(String[] args) {
        int input=10;
        for(int i=2;i<input;i++){
            boolean isprime = true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                  isprime=false;
                }
            }
            if(isprime){
                System.out.println(i);
            }
        }
    }
}
