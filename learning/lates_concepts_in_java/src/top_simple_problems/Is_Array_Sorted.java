package top_simple_problems;

import java.util.ArrayList;
import java.util.List;

public class Is_Array_Sorted {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(1);
        input.add(4);
        input.add(5);
        int data[] = {-2, 2, 4, 4, 4, 4, 5, 5};
        int rotatearrray[] = {1,2,3,4,5};
        rotateArrayByOne(rotatearrray);
        for(int out:rotatearrray){
            System.out.println("value"+out);
        }
        System.out.println(input.contains(5));
        System.out.println(isSorted(input));
        System.out.println(removeDuplicates(data));

    }
    public static boolean isSorted(ArrayList<Integer> nums) {
        int min = nums.stream().mapToInt(a->a).min().orElse(0);
        if(nums.get(0) !=min){
            return false;
        }
        for(int i=1;i<nums.size()-1;i++){
            System.out.println("onething"+nums.get(i+1));
            if(nums.get(i)>nums.get(i+1)){
                return false;
            }
        }
        return true;
    }
    public static int removeDuplicates(int[] nums) {
        List<Integer> data = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!data.contains(nums[i])){
                data.add(nums[i]);
            }
        }
        return data.size();
    }
    public static void rotateArrayByOne(int[] nums) {
        int first=nums[0];
        for(int i=0;i<nums.length-1;i++){
            nums[i]=nums[i+1];
        }
        nums[nums.length-1]=first;
    }
}
