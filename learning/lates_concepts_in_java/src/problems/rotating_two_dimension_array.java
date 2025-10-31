package problems;

import java.util.Arrays;

public class rotating_two_dimension_array {
    public static void main(String[] args) {
      int twodim[][] ={
              {1,2,3},
              {4,5,6},
              {7,8,9}
      };

      int newdata [][] = rotatingarray(twodim);
        for (int i = 0; i < newdata.length; i++) {
            for (int j = 0; j < newdata[i].length; j++) {
                System.out.print(newdata[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] rotatingarray(int data[][]){
        for(int i=0;i<data.length;i++){
            for(int j=i;j<data.length;j++){
               int temp = data[i][j];
                data[i][j] = data[j][i];
                data[j][i]  = temp;
            }
        }

        for (int i = 0; i < data.length; i++) {
            int start = 0;
            int end = data.length - 1;
            while (start < end) {
                int temp = data[i][start];
                data[i][start] = data[i][end];
                data[i][end] = temp;
                start++;
                end--;
            }
        }
        return data;
    }

}
