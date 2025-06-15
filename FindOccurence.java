package DSA;

// find the first and last occurences of element in sorted array using binary search
public class FindOccurence {

     static public int firstOcc(int[] a,int element)
    {
        int s=0;
        int e=a.length-1;
        int mid=s+(e-s)/2;
        int ans=-1;
        while(s<=e)
        {
            if(element==a[mid])
            {
                ans=mid;
                e=mid-1;
            }
            else if(element<a[mid])
            {
                e=mid-1;
            }
            else if (element>a[mid])
            {
                s=mid+1;
            }
            mid=s+(e-s)/2;
        }

        return ans;
    }
    public static void main(String[] args) {
     int[] arr={1,2,3,3,3,5};
     int first=firstOcc(arr,3);
        System.out.println("The first occurence of the \"3\" at Index " + first);
    }
}
