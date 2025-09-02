import java.util.*;
class Trngl_NP
{
    public static void main(String Triangular_No_Pattern[]) throws Exception
    {
        Scanner ob = new Scanner(System.in);
        int i,j,n,k;
        System.out.println("Enter the limit of the pattern");
        n = ob.nextInt();
        int m[] = new int[n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<=i;j++)
            {
                m[i]=0;
                for(k=0;k<=j;k++)
                m[i]++;
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=1;j<=m[i];j++)
            {
                for(k=1;k<=j;k++)
                System.out.print(k+" ");
                System.out.println();
            }
            System.out.println();
        }
    }
}
