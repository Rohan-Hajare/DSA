package DSA;

// Find peak element from mountain array
//Examples of mountain array
// [2,3,5,7,4,1,0] here peak elements is 7
// [1,3,10,1] here peak elements is 10
public class FindPeak {
//first appraoch
    public static int findPeak(int[] arr)
    {
        int s=0;
        int e=arr.length-1;
        int mid=(s+e)/2;

        while(s<e)
        {
             if(arr[mid+1]>arr[mid])
             {
                 s=mid+1;
             }
             else
             {
                 e=mid;
             }
            mid=(s+e)/2;
        }
        return arr[s];
    }
//Second approach
    public static int find_Peak(int[] arr)
    {
        int s=0;
        int e=arr.length-1;
        int mid=(s+e)/2;

        while(s<e)
        {
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1])
            {
                return arr[mid];
            }
            else if(arr[mid+1]>arr[mid])
            {
                s=mid;
            }
            else 
            {
                e=mid-1;
            }
            mid=(s+e)/2;
        }
        return -1;
    }
    public static void main(String[] args) {

        int[] a={1,3,2,1};
//        int peak=findPeak(a);
//        System.out.println("The Peak Element is "+peak);

        int peak=find_Peak(a);
        System.out.println("The Peak Element is "+peak);
    }
}
