import java.util.*;
class Pattern_8 extends Pattern_9
{
    public static void main(String Packed_Diamond[]) throws Exception
    {
        Scanner ob = new Scanner(System.in);
        int n,i,j,k,p=0,a,b;
        System.out.println("Enter the limit of the pattern");
        n = ob.nextInt();
        b=n;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=b;j++)
            System.out.print("*");
            for(k=1;k<=p;k++)
            System.out.print(" ");
            for(a=b;a>=1;a--)
            System.out.print("*");
            System.out.println();
            p+=2;
            b--;
        }
        p-=4;
        b+=2;
        for(i=1;i<=n-1;i++)
        {
            for(j=1;j<=b;j++)
            System.out.print("*");
            for(k=1;k<=p;k++)
            System.out.print(" ");
            for(a=1;a<=b;a++)
            System.out.print("*");
            System.out.println();
            p-=2;
            b++;
        }
    }
}
