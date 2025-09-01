import java.util.*;
class Spiral_A extends Hut_P
{
    public static void main(String Spiral_Anticlockwise[]) throws Exception
    {
        Scanner ob = new Scanner(System.in);
        int i,j=0,n,p=1,q;
        System.out.println("Enter the limit");
        n = ob.nextInt();
        q=n-1;
        int m[][] = new int[n][n];
        while(p<=n*n)
        {
            for(i=j;i<=q;i++)
            {
                m[i][j]=p++;
            }
            for(i=j+1;i<=q;i++)
            {
                m[q][i]=p++;
            }
            for(i=q-1;i>=j;i--)
            {
                m[i][q]=p++;
            }
            for(i=q-1;i>j;i--)
            {
                m[j][i]=p++;
            }
            j++;
            q--;
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
