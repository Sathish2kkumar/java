package zoho_jpmorgan;

import java.util.Arrays;

public class rotat_array_by_k {
    public static void main(String[] args) {
        int arr[] ={1, 2, 3, 4, 5};
        int k=2;
        int totallength=arr.length;
        int n=k%arr.length;
        System.out.println(n);
        for(int i =0;i<n;i++){
            int last=arr[totallength-1];
            for(int j=totallength-1;j>0;j--){
                arr[j]=arr[j-1];
                System.out.println("oneoneoneoneone"+Arrays.toString(arr));
            }
            System.out.println("p");
            arr[0]=last;
        }
//        for (int i = 0; i < k; i++) {
//            int first = arr[0];
//            for (int j = 0; j < n - 1; j++) {
//                arr[j] = arr[j + 1];
//            }
//            arr[n - 1] = first;
//        }
        for (int b:arr) {
            System.out.println(b);
        }
    }
}
