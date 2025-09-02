import java.util.*;
class Pttrn_Jt
{
    public static void main(String Jet[]) throws Exception
    {
        Scanner ob = new Scanner(System.in);
        int i,j,n,p=1;
        System.out.println("Enter the limit of the pattern");
        n = ob.nextInt();
        for(i=1;i<=n/2;i++)
        {
            for(j=1;j<=p;j++)
            System.out.print("  ");
            for(j=1;j<=i;j++)
            System.out.print("* ");
            System.out.println();
            p++;
        }
        for(i=1;i<=p;i++)
        System.out.print("  ");
        for(i=1;i<=p;i++)
        System.out.print("* ");
        System.out.println();
        p--;
        for(i=1;i<=n/2;i++)
        {
            for(j=1;j<=p;j++)
            System.out.print("  ");
            for(j=1;j<=p;j++)
            System.out.print("* ");
            System.out.println();
            p--;
        }
    }
}
