package DSA.Searching;

public class BinarySearch {


    int binarysearch(int a[],int l,int r,int data)
    {
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(data==a[mid])
            {
                return mid;
            }
            else if (data<a[mid]) {
                r=mid-1;
            }
            else {
                l=mid+1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {

        int a[]={1,2,3,4,5,6,7,8,9,10};
        int n=a.length;
        int l=0;
        int r=n-1;
        int data=10;

        BinarySearch obj=new BinarySearch();
      int result=obj.binarysearch(a,l,r,data);
      if(result==-1)
      {
          System.out.println("data is not found");
      }
      else {
          System.out.println("data is  found at index: "+result);

      }
    }


}
