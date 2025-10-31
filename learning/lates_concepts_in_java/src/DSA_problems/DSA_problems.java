package DSA_problems;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DSA_problems {

    static List<Integer> evenelements=new ArrayList<>();
    static List<Integer> oddelements=new ArrayList<>();
    public static void main(String[] args) {
        int[] arr = {34,17,25,45,58};
        int[] sortedarray=bubblesort(arr);
        System.out.println("minimumvalue "+arr[0]);
        System.out.println("maxvalue "+arr[arr.length-1]);
        System.out.println("sorted array is"+Arrays.toString(sortedarray));
        System.out.println("list of odd number is "+countlistofoddnumber(arr)+"    "+oddelements);
        System.out.println("list of even number is "+countlistofevennumber(arr)+"           "+evenelements);
        System.out.println("finding sum and average of the number is " +findingsumandaverageofthenumbers(arr));
        System.out.println("getting maximum numbers"+findmaxandminvales(arr));
        System.out.println("getting min values"+findminandminvales(arr));
    }
    public static int countlistofoddnumber(int[] arr1) {
        int odd = 0;
        for (int a : arr1) {
            if (a % 2 != 0) {
                odd++;
                oddelements.add(a);
            }
        }
        return odd;
    }

    public static int countlistofevennumber(int[] arr1) {
        int even = 0;
        for (int a : arr1) {
            if (a % 2 == 0) {
                even++;
                evenelements.add(a);
            }
        }
        return even;
    }
    public static double findingsumandaverageofthenumbers(int[] arr){
        int sumofelements = 0;
        for(int b:arr){
            sumofelements+=b;
        }
        return sumofelements/arr.length;
    }
    public static int findmaxandminvales(int[] arr1){

        return Arrays.stream(arr1).max().orElse(0);
    }
    public static int findminandminvales(int[] arr1){

        return Arrays.stream(arr1).min().orElse(0);
    }
    public static int[] bubblesort(int[] arr){
        for(int i=0;i< arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
