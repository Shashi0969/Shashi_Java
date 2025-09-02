import java.util.*;
class Pttrn_13
{
    public static void main(String Table1[]) throws Exception
    {
        Scanner ob = new Scanner(System.in);
        int i,j,n;
        System.out.println("Enter the limit");
        n = ob.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            System.out.print(i*j+" ");
            System.out.println();
        }
    }
}
