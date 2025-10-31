package problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class twodimensionalarray {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b [][]=new int[10][10];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                b[i][j]=a.nextInt();
            }
        }

        int sum=0;
        for(int i=0;i<3;i++)
            sum+=b[i][i];
        System.out.println(sum);
    }
}
