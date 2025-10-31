package problems;

import java.util.Scanner;

public class findthesumofgreatestnotadjacentvalues {
    public static void main(String[] args) {

        Scanner inputdata = new Scanner(System.in);
        int inputsize = inputdata.nextInt();
        int[] inputarray = new int[inputsize];
        for(int i=0;i<inputsize;i++){
            inputarray[i] = inputdata.nextInt();
        }
        System.out.println(greatestsumofnonadjacentnumbers(inputarray));
    }
    public static int greatestsumofnonadjacentnumbers(int[] input){
        int max = Math.max(input.length,0);
        for(int i =0;i<input.length;i++){
            for(int j=i+2;j<input.length;j++){
                int sum  = input[i]+input[j];
                max=Math.max(max,sum);
            }
        }
        return max;
    }
}