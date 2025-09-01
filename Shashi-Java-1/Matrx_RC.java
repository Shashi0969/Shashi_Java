import java.util.*;
class Matrx_RC extends Zig_Zag
{
    public static void main(String Matrix_Clockwise_Rotation[]) throws Exception
    {
        Scanner ob = new Scanner(System.in);
        int i,n,j;
        System.out.println("Enter the limit of the matrix");
        n = ob.nextInt();
        int m[][] = new int[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                m[i][j] = ob.nextInt();
            }
        }
        System.out.println("Matrix before rotation");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrix after rotation");
        for(i=0;i<n;i++)
        {
            for(j=n-1;j>=0;j--)
            {
                System.out.print(m[j][i]+" ");
            }
            System.out.println();
        }
    }
}
