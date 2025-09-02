import java.util.*;
class DDA
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int n,p,i,j;
        System.out.println("Enter the limit of the row");
        n = ob.nextInt();
        System.out.println("Enter the limit of the column");
        p = ob.nextInt();
        int m[][] = new int[n][p];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the elements of "+i+" th row");
            for(j=0;j<p;j++)
            {
                m[i][j] = ob.nextInt();
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<p;j++)
            {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
}
