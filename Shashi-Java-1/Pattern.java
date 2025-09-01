import java.util.*;
class Pattern extends Pattern_2
{
    public static void main(String Pattern_Star[])
    {
        Scanner ob = new Scanner(System.in);
        int n,i,j,k,p,m,l=2;
        System.out.println("Enter the limit of pattern");
        n = ob.nextInt();
        p = n;
        System.out.println("Diamond Pattern");
        for(i=1;i<=n;i++)
        for(k=1;k<99999999;k++)
        {
            for(m=p;m>=1;m--)
            {
                for(k=1;k<99999999;k++);
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                for(k=1;k<99999999;k++);
                System.out.print("* ");
            }
            System.out.println();
            p = p-1;
        }
        p = 1;
        for(i=n;i>=1;i--)
        for(k=1;k<99999999;k++)
        {
            for(m=p;m<=l;m++)
            {
                for(k=1;k<99999999;k++);
                System.out.print(" ");
            }
            for(j=i-1;j>=1;j--)
            {
                for(k=1;k<99999999;k++);
                System.out.print("* ");
            }
            System.out.println();
            l = l+1;
        }
    }
}
