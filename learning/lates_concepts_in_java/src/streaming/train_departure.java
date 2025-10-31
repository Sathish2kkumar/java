package streaming;

import java.util.Arrays;

public class train_departure {
    public static void main(String[] args) {
        int[] arr = {1000, 935, 1100};
        int[] dep = {1200, 1240, 1130};
        int output=findMinPlatforms(arr,dep);


    }
    public static int findMinPlatforms(int[] arr, int[] dep) {
        // Step 1: Sort arrival and departure arrays
        Arrays.sort(arr);
        Arrays.sort(dep);

        int platforms_needed = 0;
        int max_platforms = 0;
        int i = 0, j = 0;
        int n = arr.length;

        // Step 2: Traverse through arrival and departure arrays
        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {  // A train arrives before previous departs
                platforms_needed++;
                max_platforms = Math.max(max_platforms, platforms_needed);
                i++;
            } else {                 // A train departs
                platforms_needed--;
                j++;
            }
        }

        return max_platforms;
    }
}
