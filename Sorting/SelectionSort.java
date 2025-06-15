package DSA.Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={7,5,12,4,1};

        System.out.println("Arrray Before sorting ");
        for (int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }

        for (int i = 0; i <arr.length-1 ; i++)
        {
            int min=i;

            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }

            if(min!=i)
            {
//                arr[min]=arr[min]+arr[i];
//                arr[i]=arr[min]-arr[i];
//                arr[min]=arr[min]-arr[i];

                int temp=arr[i];
                arr[i]=min;
                min=temp;
            }

        }
        System.out.println(" ");
        System.out.println("Arrray Befor sorting ");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
