import java.util.*;
class Zig_Zag extends Trngl_NP
{
    public static void main(String Zig_Zag[]) throws Exception
    {
        Scanner ob = new Scanner(System.in);
        int i,j,n,p=1,k=-1,t;
        System.out.println("Enter the limit");
        n = ob.nextInt();
        int m[][] = new int[n][n+1];
        for(i=0;i<n;i+=2)
        {
            k=-1;
            t=i;
            for(j=0;j<n;j++)
            {
                k*=-1;
                m[j][i]=p++;
                i+=k;
            }
            i=t;
        }
        k=1;
        for(i=1;i<n+1;i+=2)
        {
            k=1;
            t=i;
            for(j=0;j<n;j++)
            {
                k*=-1;
                m[j][i]=p++;
                i+=k;
            }
            i=t;
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n+1;j++)
            {
                if(m[i][j]>0)
                {
                    if(m[i][j]>9)
                    System.out.print(m[i][j]+" ");
                    else
                    System.out.print("0"+m[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
