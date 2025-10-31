package problems;

import java.util.Scanner;

public class patternproblem1 {
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        int one = b.nextInt();
//        patternsol(one);
//        palindrome(one);
        triangularpatter(one);
    }
    public static void patternsol(int limit){
        for(int i=1;i<=limit;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.print("1");
            System.out.println();
        }
    }
    public static void palindrome(int limit){
        for(int i=1;i<=limit;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int k=i-1;k>=1;k--){
                System.out.print(k);
            }
            System.out.println();
        }
    }
    public static void triangularpatter(int limit){
        for(int i=0;i<=limit;i++){
            for(int j=0;j<i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
