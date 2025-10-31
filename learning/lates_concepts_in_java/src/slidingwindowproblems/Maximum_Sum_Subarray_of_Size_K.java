package slidingwindowproblems;

public class Maximum_Sum_Subarray_of_Size_K {
    public static void main(String[] args) {
        int a[] ={2,1,5,1,3,2};
        int target=3;
        solution(a,target);
    }
    public static Integer solution(int [] input,int target){
        int count = 0;
        int windowvalue=0;
        for(int i=0;i<target;i++){
            count+=input[i];
        }
        windowvalue=count;
        for(int end=target;end<input.length;end++){
            windowvalue+=input[end]-input[end-target];
              count = Math.max(windowvalue,count);
        }
        System.out.println(count);
        return count;

    }
}
