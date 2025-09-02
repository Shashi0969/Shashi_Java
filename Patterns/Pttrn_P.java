import java.util.*;
class Pttrn_P
{
    public static void main(String Pencil[]) throws Exception
    {
        Scanner ob = new Scanner(System.in);
        int i,j,n,p,m=1,k;
        System.out.println("Enter the limit of the pattern");
        n = ob.nextInt();
        p=n-1;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=p;j++)
            System.out.print("  ");
            for(j=1;j<=m;j++)
            System.out.print("* ");
            p--;
            m+=2;
            System.out.println();
        }
        k=m-2;
        m-=4;
        for(i=1;i<=n-1;i++)
        {
            for(j=1;j<=i;j++)
            System.out.print("* ");
            for(j=1;j<=m;j++)
            System.out.print("  ");
            for(j=1;j<=i;j++)
            System.out.print("* ");
            m-=2;
            System.out.println();
        }
        for(i=1;i<=k;i++)
        System.out.print("* ");
        System.out.println();
        m+=2;
        for(i=n-1;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            System.out.print("* ");
            for(j=1;j<=m;j++)
            System.out.print("  ");
            for(j=1;j<=i;j++)
            System.out.print("* ");
            m+=2;
            System.out.println();
        }
        for(i=1;i<=k;i++)
        {
            for(j=1;j<i;j++)
            System.out.print("  ");
            for(j=1;j<=m;j++)
            System.out.print("* ");
            m-=2;
            System.out.println();
        }
    }
}
