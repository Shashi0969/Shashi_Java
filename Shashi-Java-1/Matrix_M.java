import java.util.*;
class Matrix_M
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int i,j,k=0;
        int m[][] = new int[2][2];
        int n[][] = new int[2][2];
        int p[][] = new int[2][2];
        System.out.println("Enter elements of first matrix");
        for(i=0;i<2;i++)
        {
            System.out.println("Enter elements of "+i+" th row");
            for(j=0;j<2;j++)
            {
                m[i][j] = ob.nextInt();
            }
            System.out.println();
        }
        System.out.println("Enter elements of second matrix");
        for(i=0;i<2;i++)
        {
            System.out.println("Enter elements of "+i+" th row");
            for(j=0;j<2;j++)
            {
                n[i][j] = ob.nextInt();
            }
            System.out.println();
        }
        for(i=0;i<2;i++)
        {
            k=0;
            for(j=0;j<2;j++)
            {
                p[i][j] = m[i][k]*n[k][j]+m[i][k+1]*n[k+1][j];
            }
        }
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(p[i][j]+" ");
            }
            System.out.println();
        }
    }
}
