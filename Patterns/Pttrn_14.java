import java.util.*;
class Pttrn_14
{
    public static void main(String Table[]) throws Exception
    {
        Scanner ob = new Scanner(System.in);
        int i,j,n,m,p=1;
        System.out.println("Enter the limit of no.s");
        n = ob.nextInt();
        System.out.println("Enter the limit of multiplication");
        m = ob.nextInt();
        for(i=1;i<=m;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print(j*p+"  ");
            }
            p++;
            System.out.println();
        }
    }
}
