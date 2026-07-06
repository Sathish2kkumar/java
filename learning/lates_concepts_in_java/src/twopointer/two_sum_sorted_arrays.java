package twopointer;

public class two_sum_sorted_arrays {
    public static void main(String[] args) {

        int input[]={1,2,3,4,7,8,9,11};

        int left=0;
        int right=input.length-1;
        int target=13   ;

        while(left<right){
            if(input[left]+input[right]>target){
                right--;
            } else if (input[left]+input[right]<target) {
                left++;

            } else {
                System.out.println(input[left]+","+input[right]);
                break;
            }
        }

    }
}
