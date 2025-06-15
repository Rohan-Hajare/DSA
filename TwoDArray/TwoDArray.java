package DSA.TwoDArray;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr=new int[3][3]; // 1 2 3 4 5 6 7 8 9
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array elements");

        // row wise input
//        for(int row=0;row<arr.length;row++)
//        {
//            for(int col=0;col<arr.length;col++)
//            {
//                arr[row][col]=sc.nextInt();
//            }
//        }
//        System.out.println();



        // colum wise input
        for(int row=0;row<arr.length;row++)
        {
            for(int col=0;col<arr.length;col++)
            {
                arr[col][row]=sc.nextInt();
            }
        }
        System.out.println();



        //print the array
        for(int row=0;row<arr.length;row++)
        {
            for(int col=0;col<arr.length;col++)
            {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }

        //printing rows sum
        rowSum(arr,3,3);

        //printing cloumn sum
        colSum(arr,3,3);

        //printing larget sum of rows
        maxRowSum(arr,3,3);

        //printing largest column sum
        maxColSum(arr,3,3);
    }




    static void rowSum(int[][] arr,int r,int c)
    {
        System.out.println("The Sum of each row is ");

        for(int row=0;row<r;row++)
        {
            int sum=0;
            for(int col=0;col<c;col++)
            {
                sum+=arr[row][col];
            }
            System.out.print(sum+" ");
        }
        System.out.println();
    }



    static void colSum(int[][] arr,int r,int c)
    {
        System.out.println("The Sum of each Column is ");

        for(int row=0;row<r;row++)
        {
            int sum=0;
            for(int col=0;col<c;col++)
            {
                sum+=arr[col][row];
            }
            System.out.print(sum+" ");
        }

        System.out.println();
    }




    static void maxRowSum(int[][] arr,int r,int c)
    {
        System.out.println("The Maximum Sum of row is ");
        int max=0;
        for(int row=0;row<r;row++)
        {

            int sum=0;
            for(int col=0;col<c;col++)
            {
                sum+=arr[row][col];
            }
            max=Math.max(max,sum);

        }

        System.out.println(max);
    }




    static void maxColSum(int[][] arr,int r,int c)
    {
        System.out.println("The Maximum Sum of Columns is ");
        int max=0;
        for(int row=0;row<r;row++)
        {

            int sum=0;
            for(int col=0;col<c;col++)
            {
                sum+=arr[col][row];
            }
            max=Math.max(max,sum);

        }

        System.out.println(max);

    }
}
