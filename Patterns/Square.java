import java.util.*;
class Square
{
    public static void main(String Diagonal_Square[])
    {
        Scanner ob = new Scanner(System.in);
        int n,i,j;
        System.out.println("Enter the limit of the square");
        n = ob.nextInt();
        System.out.println("Square");
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(i==1||j==1||i==j||i==n||j==n||i+j==n+1)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}