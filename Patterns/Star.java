import java.util.*;
class Star
{
    public static void main(String Star[]) throws Exception
    {
        Scanner ob = new Scanner(System.in);
        int i,p,j,n;
        System.out.println("Enter the limit of the pattern");
        n = ob.nextInt();
        if(n%2==0)
        n++;
        p = n/2+1;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(i==j||i+j==n+1||i==p||j==p)
                System.out.print("* ");
                else 
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
