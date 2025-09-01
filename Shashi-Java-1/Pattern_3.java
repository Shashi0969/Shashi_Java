import java.util.*;
class Pattern_3 extends Pattern_4
{
    public static void main(String Empty_Diamond[])
    {
        Scanner ob = new Scanner(System.in);
        int n,i,j,k,m,l=2,p;
        System.out.println("Enter the limit of the pattern");
        n = ob.nextInt();
        p = n;
        for(i=1;i<=n;i++)
        for(k=1;k<99999999;k++)
        {
            for(m=p;m>=1;m--)
            {
                for(k=1;k<99999999;k++);
                System.out.print(" ");
            }
            System.out.print("* ");
            for(j=1;j<=i-2;j++)
            {
                for(k=1;k<99999999;k++);
                System.out.print("  ");
            }
            p = p-1;
            if(i>1)
            System.out.println("* ");
            else 
            System.out.println();
        }
        p = 1;
        for(i=n-1;i>=1;i--)
        for(k=1;k<99999999;k++)
        {
            for(m=p;m<=l;m++)
            {
                for(k=1;k<99999999;k++);
                System.out.print(" ");
            }
            System.out.print("* ");
            for(j=i-2;j>=1;j--)
            {
                for(k=1;k<99999999;k++);
                System.out.print("  ");
            }
            l = l+1;
            if(i>1)
            System.out.println("* ");
        }
    }
}
