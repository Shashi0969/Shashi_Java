import java.util.*;
class Cross
{
    public static void main(String cross[]) throws Exception
    {
        Scanner ob = new Scanner(System.in);
        int n,i,j,k;
        System.out.println("Enter the limit of the cross");
        n = ob.nextInt();
        System.out.println("Cross");
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(i==j||i+j==n+1)
                System.out.print("*");
                else 
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}