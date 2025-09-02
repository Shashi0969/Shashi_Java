import java.util.*;
class Pattern_2
{
    public static void main(String Pattern_no[])
    {
        Scanner ob = new Scanner(System.in);
        int n,i,j,k,p,m,l;
        System.out.println("Enter the limit of the pattern");
        n = ob.nextInt();
        p = n;
        System.out.println("Diamond Pattern");
        for(i=1;i<=n;i++)
        {
            for(k=p;k>=1;k--)
            {
                for(m=1;m<99999999;m++);
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                for(m=1;m<99999999;m++);
                System.out.print(j+" ");
            }
            System.out.println();
            p = p-1;
        }
        p = 1;
        l = 2;
        for(i=n;i>=1;i--)
        {
            for(k=p;k<=l;k++)
            {
                for(m=1;m<99999999;m++);
                System.out.print(" ");
            }
            for(j=1;j<=i-1;j++)
            {
                for(m=1;m<99999999;m++);
                System.out.print(j+" ");
            }
            System.out.println();
            l = l+1;
        }
    }
}
