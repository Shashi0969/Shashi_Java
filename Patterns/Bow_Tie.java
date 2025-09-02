import java.util.*;
class Bow_Tie
{
    public static void main(String Bow_Tie[]) throws Exception
    {
        Scanner ob = new Scanner(System.in);
        int i,n,p,j,b=1;
        System.out.println("Enter the limit");
        n = ob.nextInt();
        p=2*n-2;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            System.out.print("* ");
            for(j=1;j<=p;j++)
            System.out.print("  ");
            for(j=1;j<=i;j++)
            System.out.print("* ");
            p-=2;
            System.out.println();
        }
        b=n-1;
        p+=4;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=b;j++)
            System.out.print("* ");
            for(j=1;j<=p;j++)
            System.out.print("  ");
            for(j=1;j<=b;j++)
            System.out.print("* ");
            System.out.println();
            p+=2;
            b--;
        }
    }
}
