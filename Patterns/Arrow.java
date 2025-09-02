import java.util.*;
class Arrow
{
    public static void main(String Arrow[]) throws Exception
    {
        Scanner ob = new Scanner(System.in);
        int i,j,p,n;
        System.out.println("Enter the limit");
        n = ob.nextInt();
        p=n/2;
        for(i=1;i<=n/2;i++)
        {
            for(j=1;j<=p;j++)
            System.out.print("  ");
            System.out.println("*");
            p++;
        }
        if(n%2==0)
        n++;
        for(i=1;i<=n;i++)
        System.out.print("* ");
        System.out.println();
        p--;
        for(i=1;i<=n/2;i++)
        {
            for(j=1;j<=p;j++)
            System.out.print("  ");
            System.out.println("*");
            p--;
        }
    }
}
