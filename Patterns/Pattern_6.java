import java.util.*;
class Pattern_6
{
    public static void main(String Empty_Square[])
    {
        Scanner ob = new Scanner(System.in);
        int n,i,j,m,p,q;
        System.out.println("Enter the limit of the pattern");
        System.out.println("Enter the limit of the column");
        n = ob.nextInt();
        System.out.println("Enter the limit of the row");
        m = ob.nextInt();
        System.out.println("Pattern");
        for(i=1;i<=n;i++)
        {
            for(int k=1;k<99999999;k++);
            System.out.print("@");
        }
        System.out.println();
        {
            for(i=1;i<=m;i++)
            {
                {
                    for(int k=1;k<999999999;k++);
                    System.out.print("*");
                }
                for(j=1;j<=n-2;j++)
                {
                    System.out.print(" ");
                }
                for(int k=1;k<999999999;k++);
                System.out.println("*");
            }
        }
        for(i=1;i<=n;i++)
        {        
            for(int k=1;k<99999999;k++);
            System.out.print("@");
        }
    }
}
