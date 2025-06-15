package DSA.Array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println("Is this array contains duplicates? "+containsDuplicate(nums));
    }
    public static  boolean containsDuplicate(int[] nums) {
        Set<Integer> seen=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(seen.contains(nums[i]))
            {
                return true;
            }
            seen.add(nums[i]);
        }
        // Arrays.sort(nums);
        // for(int i=1;i<nums.length;i++)
        // {
        //     if(nums[i]==nums[i-1])
        //     {
        //         return true;
        //     }
        // }

        return false;
    }
}
