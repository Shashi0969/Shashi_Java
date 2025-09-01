import java.util.*;
class Kite extends Pttrn_P
{
    public static void main(String Kite[]) throws Exception
    {
        Scanner ob = new Scanner(System.in);
        int i,j,n,p,m=1;
        System.out.println("Enter the limit of the pattern");
        n = ob.nextInt();
        p = n-1;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=p;j++)
            System.out.print("  ");
            for(j=1;j<=m;j++)
            System.out.print("* ");
            System.out.println();
            m+=2;
            p--;
        }
        p+=2;
        m-=4;
        for(i=1;i<=n-1;i++)
        {
            for(j=1;j<=p;j++)
            System.out.print("  ");
            for(j=1;j<=m;j++)
            System.out.print("* ");
            System.out.println();
            m-=2;
            p++;
        }
        p-=2;
        m+=4;
        for(i=1;i<=n/2;i++)
        {
            for(j=1;j<=p;j++)
            System.out.print("  ");
            for(j=1;j<=m;j++)
            System.out.print("* ");
            System.out.println();
            m+=2;
            p--;
        }
    }
}
