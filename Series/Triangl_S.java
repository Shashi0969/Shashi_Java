import java.util.*;
class Triangl_S
{
    public static void main(String Triangular_No_Series[])
    {
        Scanner ob = new Scanner(System.in);
        int i,j,p,n;
        System.out.println("Enter the limit of the Series");
        n = ob.nextInt();
        int m[] = new int[n];
        for(p=0;p<n;p++)
        {
            m[p]=0;
            for(i=0;i<=p;i++)
            {
                for(j=0;j<=i;j++)
                m[p]++;
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.println(m[i]);
        }
    }
}
