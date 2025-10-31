package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findthemaximumsumofsubarray {
    public static void main(String[] args) {
     int a[] ={2,1,5,1,3,2};
     int target=3;
//        System.out.println(sumofsubarray(a,target));
//        System.out.println(sumofsubarrayusingslidewindow(a,target));
        int[] cups = {1, 3, 2, 5, 4, 6,7,8,9,10}; // Number of scoops in each cup
        int windowSize = 5;

        for (int i = 0; i <= cups.length - windowSize; i++) {
            int sum = 0;
            for (int j = i; j < i + windowSize; j++) {
                sum += cups[j];
            }
            System.out.println("Scoops tasted from cup " + i + " to " + (i+4) + " = " + sum);
        }
    }
    public static int sumofsubarrayusingslidewindow(int arr[],int count){
        int windowvalue=0;
        int maxsize=0;
        for(int i=0;i<count;i++){
            maxsize+=arr[i];
        }
        for(int i=count;i< arr.length;i++){
            windowvalue+=arr[i]+arr[i-count];
            maxsize=Math.max(windowvalue,maxsize);
        }

        return maxsize;

    }
    public static int sumofsubarray(int arr[],int count){
        List<Integer> intvalues = new ArrayList<>();
        int incrementvalue=3;
        for(int j=0;j<arr.length;j++){
            int a = 0;
            for(int i=j;i<incrementvalue&&i<arr.length;i++){
                a+=arr[i];
            }
                incrementvalue+=1;
            intvalues.add(a);
        }
        System.out.println(intvalues);
        return intvalues.stream().max(Integer::compare).orElse(0);

    }
}
