import java.util.*;
class Hut_P extends Pttrn_S
{
    public static void main(String Hut[]) throws Exception
    {
        Scanner ob = new Scanner(System.in);
        int i,j,p=1,n,m;
        System.out.println("Enter the limit of the pattern");
        n = ob.nextInt();
        m=n-1;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=m;j++)
            System.out.print("  ");
            for(j=1;j<=p;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
            p+=2;
            m--;
        }
        p-=8;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=3;j++)
            System.out.print("* ");
            for(j=1;j<=p;j++)
            System.out.print("  ");
            for(j=1;j<=3;j++)
            System.out.print("* ");
            System.out.println();
        }
    }
}
