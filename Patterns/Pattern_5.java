import java.util.*;
class Pattern_5
{
    public static void main(String Character[]) 
    {
        Scanner ob = new Scanner(System.in);
        char ch,st=' ';
        int n,i,j,k,m,c;
        System.out.println("Enter a character ");
        ch = ob.next().charAt(0);
        System.out.println("Enter the limit of the pattern");
        n = ob.nextInt();
        k = n;
        int p=0;
        for(i=1;i<=n;i++)
        {
            System.out.print(p+".");
            for(j=k;j>=1;j--)
            {
                System.out.print("  ");
            }
            for(c=ch;c<=ch+i-1;c++)
            {
                st = (char)c;
                System.out.print(st+" ");
            }
            for(m=c-2;m>=ch;m--)
            {
                st = (char)m;
                System.out.print(st+" ");
            }
            System.out.println();
            k--;
            p++;
        }
    }
}