import java.util.*;
class Wave
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int i,j,n,p,k,l,m,q=0;
        System.out.println("Enter the limit of the pattern");
        n = ob.nextInt();
        System.out.println("Enter the no. of Triangles");
        p = ob.nextInt();
        m = n-1;
        l = 0;
        for(i=1;i<=n;i++)
        {
            for(k=1;k<=m;k++,q++)
            System.out.print(" ");
            for(j=1;j<=p;j++,q++)
            {
                if(q>9)
                System.out.print(q);
                else
                System.out.print("0"+q);
                for(k=1;k<l;k++,q++)
                System.out.print(" ");
                if(l>1)
                {
                    q++;
                    if(q>9)
                    System.out.print(q);
                    else
                    System.out.print("0"+q);
                }
                for(k=1;k<=m;k++,q+=2)
                System.out.print("  ");
            }
            System.out.println();
            m--;
            l+=2;
            q=0;
        }
    }
}
