import java.util.*;
class Cross_2 extends Star
{
    public static void main(String Cross_2[]) throws Exception
    {
        Scanner ob = new Scanner(System.in);
        int i,n,j,p;
        System.out.println("Enter the limit");
        n = ob.nextInt();
        for(i=1;i<=n;i++)
        {
            if(i>1&&i<n)
            System.out.print("* ");
            for(j=1;j<=n;j++)
            {
                if(i==j||i+j==n+1)
                System.out.print("* ");
                else 
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
