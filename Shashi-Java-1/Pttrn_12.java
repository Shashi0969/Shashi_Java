import java.util.*;
class Pttrn_12 extends Pttrn_13
{
    public static void main(String R_Aligned[]) throws Exception
    {
        Scanner ob = new Scanner(System.in);
        int i,j,p,n;
        System.out.println("Enter the limit");
        n = ob.nextInt();
        p=0;
        for(i=1;i<=n;i++)
        {
            p+= i;
            for(j=p;j>p-i;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
