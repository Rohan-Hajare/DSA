package DSA.Sorting;

public class BubbleSort {

    public static void main(String[] args) {
        int arr[]={7,4,1,5,9};

        for (int i = 0; i < arr.length ; i++)
        {
            int j=0;
          while(j < arr.length-1)
          {
              if(arr[j]>arr[j+1])
              {
                  arr[j]=arr[j]+arr[j+1];
                  arr[j+1]=arr[j]-arr[j+1];
                  arr[j]=arr[j]-arr[j+1];
              }
              j++;
          }
        }

        for (int i :arr) {
            System.out.print(i+" ");
        }
    }
}
