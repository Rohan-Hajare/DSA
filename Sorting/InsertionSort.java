package DSA.Sorting;

// it is most adaptable and stable sorting algorithm
//best time complexity is O(n)
//worst time complexity is O(n^2)
//here we select first element of array as sorted & then compare that with next element
//if the next element is less then shift the element to the right
public class InsertionSort {

    static void insertionSort(int[] arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            int temp=arr[i];
            int j=i-1;
            while(j>=0)
            {
                if(arr[j]>temp)
                {
                    arr[j+1]=arr[j];
                }
                else
                {
                    break;
                }
                j--;
            }
            arr[j+1]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,10,8,11};
        insertionSort(arr);
        for (int s:arr)
        {
            System.out.print(s+" ");
        }
    }
}
