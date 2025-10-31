package top_simple_problems;

public class fibanacii {
    public static void main(String[] args) {
        int first=0;
        int second=1;
        int sum=0;
        for(int i=1;i<10;i++){
            int sumation=first+second;
            sum+=sumation;
            first=second;
            second=sumation;
        }
        System.out.println(sum);
    }
}
