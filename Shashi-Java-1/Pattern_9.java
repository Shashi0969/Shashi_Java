import java.util.*;
class Pattern_9 extends Cross_2
{
    public static void main(String Dual_Triangle[]) throws Exception
    {
        Scanner ob = new Scanner(System.in);
        int i,j,k,n,p;
        System.out.println("Enter the limit of the pattern");
        n = ob.nextInt();
        for(i=1;i<=n;i++)
        {
            System.out.print("* ");
            for(k=1;k<=i-2;k++)
            System.out.print("  ");
            if(i>1)
            System.out.print("* ");
            System.out.println();
        }
        for(i=1;i<=2*n+1;i++)
        System.out.print("* ");
        System.out.println();
        p = n-1;
        for(i=n+1;i<=2*n;i++)
        { 
            for(j=1;j<=i;j++)
            System.out.print("  ");
            System.out.print("* ");
            for(k=p;k>1;k--)
            System.out.print("  ");
            if(i<n*2)
            System.out.print("* ");
            System.out.println();
            p--;
        }
    }
}
