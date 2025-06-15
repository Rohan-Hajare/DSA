package DSA.Array;

public class MaxSumSubArray {


    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int k = 3;

        System.out.println("Count of subarrays with sum = " + k + ": " + subarraySum(nums, k));
    }
    public static int subarraySum(int[] nums, int k) {

        int cnt=0;
        for(int s=0;s<nums.length;s++)
        {
            int sum=0;
            for(int e=s;e<nums.length;e++)
            {

                sum += nums[e];

                // Check if the current sum equals k
                if (sum == k) {
                    cnt++;
                }
            }

        }
        return cnt;
    }
}
