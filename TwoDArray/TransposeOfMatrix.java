package DSA.TwoDArray;

public class TransposeOfMatrix {

    public static void main(String[] args) {

         int[][]  matrix={{1,2,3},
                          {4,5,6},
                          {7,8,9} };
         int r=matrix.length;
         int c=matrix[0].length;
        System.out.println("Matirix is: " );
         for(int i=0;i<r;i++)
         {
             for(int j=0;j<c;j++)
             {
                 System.out.print(matrix[i][j]+" ");
             }
             System.out.println();
         }

        System.out.println("Transpose of matrix is: ");
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<r;j++)
            {
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }

    }
}


