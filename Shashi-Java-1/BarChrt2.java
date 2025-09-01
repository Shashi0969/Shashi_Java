import java.util.*;
class BarChrt2
{
    public static void main(String args[]) throws Exception
    {
        Scanner ob = new Scanner(System.in);
        int i,j;
        int m[][] = new int[5][5];
        int p[] = {4,2,4,3,3};
        //for(i=0;i<5;i++)
        //m[i] = ob.nextInt();
        for(i=4;i>=0;i--)
        {
            for(j=4;j>=0;j--)
            {
                if(i+1>=p[j])
                m[i][j]=1;
                else 
                m[i][j]=0;
            }
        }
        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
            {
                if(m[i][j]==0)
                System.out.print("    ");
                else
                System.out.print("*   ");
            }
            System.out.println();
        }
        for(i=1;i<=5;i++)
        System.out.print("["+i+"] ");
    }
}
