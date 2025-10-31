package top_simple_problems;

public class paractise {
    public static void main(String[] args) {
        int range=10;
        for(int i=2;i<range;i++){
            boolean isprime=true;
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
