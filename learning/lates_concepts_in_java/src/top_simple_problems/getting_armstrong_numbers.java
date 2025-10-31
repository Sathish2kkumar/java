package top_simple_problems;

public class getting_armstrong_numbers {
    public static void main(String[] args) {
        int range=200;
        for(int i=100;i<=range;i++){
            int digits = String.valueOf(i).length();
            int t=i;
            int sum=0;
            while(t>0){
                int digit = t%10;
                sum+=Math.pow(digit,digits);
                t=t/10;
            }
            if(sum==i){
                System.out.println(i);
            }
        }
    }
}
