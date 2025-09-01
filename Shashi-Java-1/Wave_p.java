import java.util.*;
class Wave_p extends Arrow
{
    public static void main(String Wave[]) throws Exception
    {
        Scanner ob = new Scanner(System.in);
        int i,j,n,p,k,l,m;
        System.out.println("Enter the limit of the pattern");
        n = ob.nextInt();
        System.out.println("Enter the no. of Triangles");
        p = ob.nextInt();
        m = n-1;
        l = 0;
        for(i=1;i<=n;i++)
        {
            for(k=1;k<=m;k++)
            System.out.print(" ");
            for(j=1;j<=p;j++)
            {
                System.out.print("*");
                for(k=1;k<l;k++)
                System.out.print(" ");
                if(l>1)
                System.out.print("* ");
                else
                System.out.print(" ");
                for(k=1;k<=m;k++)
                System.out.print("  ");
            }
            System.out.println();
            m--;
            l+=2;
        }
    }
}
