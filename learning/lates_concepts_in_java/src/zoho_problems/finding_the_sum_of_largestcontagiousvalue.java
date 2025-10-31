package zoho_problems;

public class finding_the_sum_of_largestcontagiousvalue {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(contagious_subarray(arr));
    }
    public static int contagious_subarray(int [] one){
        int max_sum=one[0];
        int current_sum=one[0];
        for(int i=1;i<one.length;i++){
            current_sum=Math.max(one[i],current_sum+one[i]);
            max_sum=Math.max(max_sum,current_sum);

        }
        return max_sum;
    }
}
