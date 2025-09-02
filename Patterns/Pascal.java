import java.util.*;
class Pascal
{
    public static void main(String Pascal[]) throws Exception
    {
        Scanner ob = new Scanner(System.in);
        int i,n,j,k,m=1;
        System.out.println("Enter the limit");
        n = ob.nextInt();
        for(i=0;i<n;i++)
        {
            for(k=n;k>i;k--)
            System.out.print(" ");
            m=1;
            for(j=0;j<=i;j++)
            {
                System.out.print(m+" ");
                m = m*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
