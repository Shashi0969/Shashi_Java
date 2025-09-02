import java.util.*;
class Pttrn_S
{
    public static void main(String Shift_2[]) throws Exception
    {
        Scanner ob = new Scanner(System.in);
        int i,j=0,n,p=1,k=0,d=0;
        System.out.println("Enter the limit");
        n = ob.nextInt();
        int m[][] = new int[n][n];
        while(p<=n*n)
        {
            for(i=k;i<=d;i++)
            {
                m[i][j]=p++;
                j--;
            }
            if(d<n)
            d++;
            if(d>=n)
            {
                k++;
                d--;
            }
            j=d;
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(m[i][j]<10)
                System.out.print("0"+m[i][j]+" ");
                else
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
}
