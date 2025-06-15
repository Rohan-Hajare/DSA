package DSA.TwoDArray;

import java.util.ArrayList;
import java.util.List;

public class SprialMatrix {
   static List<Integer> ans=new ArrayList<Integer>();
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3,4},
                {4, 5, 6,4},
                {7, 8, 9,4}
        };
        int r=matrix.length;
        int c=matrix[0].length;
//        System.out.println(r);

        System.out.println(printSpiral(matrix,r,c));

    }

    public static List<Integer> printSpiral(int[][] matrix, int r, int c)
    {
//        int r=matrix.length;
//        int c=matrix[0].length;
        int sr=0;
        int er=r-1;
        int sc=0;
        int ec=c-1;

        int count=0;
        int total=r*c;

        while(count<total)
        {
            //print starting row
            for(int i=sc;i<=ec && count<total;i++)
            {
                 System.out.print(matrix[sr][i]);
                ans.add(matrix[sr][i]);
                count++;
            }
            sr++;

            //print ending column
            for(int i=sr;i<=er && count<total;i++)
            {
                 System.out.print(matrix[i][ec]);
                ans.add(matrix[i][ec]);
                count++;
            }
            ec--;

            //print ending row
            for(int i=ec;i>=sc && count<total;i--)
            {
                 System.out.print(matrix[er][i]);
                ans.add(matrix[er][i]);
                count++;
            }

            er--;

            //print starting column
            for(int i=er;i>=sr && count<total;i--)
            {
                 System.out.print(matrix[i][sc]);
                ans.add(matrix[i][sc]);
                count++;
            }
            sc++;

        }
return ans;

    }
}
