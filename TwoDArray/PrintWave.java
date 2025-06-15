package DSA.TwoDArray;

public class PrintWave {

    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};

        //print the array
        for(int row=0;row<arr.length;row++)
        {
            for(int col=0;col<arr.length;col++)
            {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
        System.out.println("Row wise wave");
       printRowWave(arr,3,3);

        System.out.println();
        System.out.println("Column wise wave");
        printColWave(arr,3,3);


    }



    static void printRowWave(int[][] arr,int r,int c)
    {
        for(int row=0;row<r;row++)
        {
            if(row%2==0)
            {
                for(int col=0;col<c;col++)
                {
                    System.out.print(arr[row][col]+" ");
                }
                System.out.print(" ");
            }
            else
            {
                for(int col=c-1;col>=0;col--)
                {
                    System.out.print(arr[row][col]+" ");
                }
                System.out.print(" ");
            }
        }

    }

    private static void printColWave(int[][] arr, int r , int c) {

        for(int row=0;row<r;row++)
        {
            if(row%2==0)
            {
                for(int col=0;col<c;col++)
                {
                    System.out.print(arr[col][row]+" ");
                }
                System.out.print(" ");
            }
            else
            {
                for(int col=c-1;col>=0;col--)
                {
                    System.out.print(arr[col][row]+" ");
                }
                System.out.print(" ");
            }

        }

    }
}
