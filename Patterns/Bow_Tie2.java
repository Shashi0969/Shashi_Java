import java.util.*;
class Bow_Tie2
{
    public static void main(String Bow_Tie_2[]) throws Exception
    {
        Scanner ob = new Scanner(System.in);
        int i,n,j,p,k=0;
        System.out.println("Enter the limit");
        n = ob.nextInt();
        p = n;
        for(i=1;i<=n/2-1;i++)
        {
            p-=2;
            for(j=i;j>=1;j--)
            {
                if(j%2==0)
                System.out.print("  ");
                else
                System.out.print("* ");
            }
            for(j=1;j<=p-1;j++)
            System.out.print("  ");
            for(j=1;j<=i;j++)
            {
                if(j%2==0)
                {
                    System.out.print("  ");
                    k=1;
                }
                else
                {
                    System.out.print("* ");
                    k=2;
                }
            }
            System.out.println();
        }
        for(i=k;i<=n;i++)
        {
            if(i%2==0)
            System.out.print("  ");
            else
            System.out.print("* ");
        }
        System.out.println();
        p=0;
        for(i=n/2;i>=1;i--)
        {
            for(j=i;j>=1;j--)
            {
                if(j%2==0)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            for(j=1;j<=p;j++)
            System.out.print("  ");
            for(j=1;j<=i-1;j++)
            {
                if(j%2==0)
                System.out.print("  ");
                else
                System.out.print("* ");
            }
            System.out.println();
            p+=2;
        }
    }
}
