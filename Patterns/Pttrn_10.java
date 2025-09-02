import java.util.*;
class Pttrn_10
{
    public static void main(String args[]) throws Exception
    {
        Scanner ob = new Scanner(System.in);
        int i,n,j,p=65,m,k,l;
        System.out.println("Enter the limit of the Pattern");
        n = ob.nextInt();
        m=n*2-2;
        System.out.println("Pattern");
        for(i=1;i<=n;i++)
        {
            for(j=65;j<=p;j++)
            System.out.print((char)j);
            for(k=1;k<=m;k++)
            System.out.print(" ");
            for(l=p;l>=65;l--)
            System.out.print((char)l);
            System.out.println();
            p++;
            m-=2;
        }
    }
}
