import java.util.*;
class Pttrn_11 extends Pttrn_12
{
    public static void main(String Shift[]) throws Exception
    {
        Scanner ob = new Scanner(System.in);
        int i,n,j;
        System.out.println("Enter the limit of the pattern");
        n = ob.nextInt();
        int m[] = new int[n];
        for(i=0;i<n;i++)
        m[i]=i+1;
        for(i=0;i<n;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(m[i]+j+" ");
            }
            System.out.println();
        }
    }
}
