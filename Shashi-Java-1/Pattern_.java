import java.util.*;
class Pattern_
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int i,j,n,k,m,p;
        char ch='a';
        System.out.println("Enter the limit");
        n = ob.nextInt();
        p=n;
        for(i=1;i<=n;i++)
        {
            for(k=1;k<i;k++)
            System.out.print(" ");
            for(j=1;j<=p;j++)
            System.out.print(ch++);
            for(k=1;k<i;k++)
            System.out.print(" ");
            ch--;
            for(j=1;j<p;j++)
            System.out.print(--ch);
            System.out.println();
            p--;
        }
    }
}
