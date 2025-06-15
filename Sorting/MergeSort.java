package DSA.Sorting;

public class MergeSort {

    static void  mergeArray(int[] a,int s,int e)
    {
        int mid=  s+(e-s)/2;
        int len1=mid-s+1;
        int len2=e-mid;

        int[] first=new int[len1];
        int[] second=new int[len2];

        int mainIndex=s;

        for (int i=0;i<len1;i++)
        {
            first[i]=a[mainIndex++];
        }
        mainIndex=mid+1;
        for (int i=0;i<len2;i++)
        {
            second[i]=a[mainIndex++];
        }
        mainIndex=s;
        int index1=0;
       int index2=0;

        while(index1<len1 && index2<len2)
        {
            if(first[index1]<second[index2])
            {
                a[mainIndex++]=first[index1++];
            }
            else
            {
                a[mainIndex++]=second[index2++];
            }

        }
        while(index1<len1)
        {
            a[mainIndex++]=first[index1++];
        }

        while(index2<len2)
        {
            a[mainIndex++]=second[index2++];
        }

    }
    static void mergerSort(int[] arr,int s,int e)
    {
        //base case
        if(s>=e)
        {
           return;
        }
        int mid= s+(e-s)/2;

        //for left array
        mergerSort(arr,s,mid);

        //for right array
        mergerSort(arr,mid+1,e);

        mergeArray(arr,s,e);

    }
    public static void main(String[] args) {
        int[] arr={3,5,2,84,4};
        mergerSort(arr,0, arr.length-1);

        for(int i:arr)
        {
            System.out.println(i+" ");
        }
    }
}
