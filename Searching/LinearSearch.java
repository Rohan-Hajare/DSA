package DSA.Searching;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={32,12,54,21,34,65,22};
        int n=arr.length;
        System.out.println("Enter the data you want to search");
        int data=sc.nextInt();
        int i;
        for (i=0; i<n; i++)
        {
            if(arr[i]==data)
            {
                System.out.println("The data is found at the index: "+i);
                break;
            }
        }
        if(i==n)
        {
            System.out.println("Data is not found");
        }
    }
}
