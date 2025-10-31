package top_simple_problems;

public class count_how_many_odd_even_integers {
    public static void main(String[] args) {
        int num = 51248;
        int lastvalue = num;
        while(lastvalue>0){
             int digit=lastvalue%10;
            if(digit%2==0){
                System.out.println("even"+digit);
            }
            else{
                System.out.println("odd"+digit);
            }
             lastvalue=lastvalue/10;

        }
        System.out.println(countingdigits(51248));
    }
    public static int countingdigits(int values){
        if(values>0){
            int digit=values%10;
            return digit+countingdigits(values/10);
        }
        return 0;
    }
}
