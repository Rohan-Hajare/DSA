package DSA.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {5,2,1,3,0};
        System.out.println("Missing number: " + missingNumber(nums));  // Output: 4
        // Expected output: 4 (since the missing number in the given array is 4)
    }
    public static int missingNumber(int[] nums) {
        int actualSum=0;
        int n=nums.length;
        int expectedSum=n*(n+1)/2;

        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            actualSum+=nums[i];
        }

        return expectedSum-actualSum;
    }
}
