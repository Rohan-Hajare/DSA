package DSA.Array;

import java.util.Arrays;

public class MaxProductOfTwoElement {

    public static void main(String[] args) {
        int[] arr={3,4,5,6,-7,8};

        System.out.println(max(arr));
    }

    static  int max(int[] arr)
    {
        Arrays.sort(arr);
        int n=arr.length;

        return Math.max((arr[0]*arr[1]),(arr[n-1]*arr[n-1-1]));
    }
}
