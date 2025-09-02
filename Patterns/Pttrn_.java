import java.util.*;
class Pttrn_
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int i,n,j,k=1,x=1,y,g;
        System.out.println("Enter the limit of the pattern");
        n = ob.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=n;j>i;j--)
            System.out.print("  ");
            for(j=0;j<k;j++)
            {
                if(j==i)
                {
                    g = (x+1)*(j+j);
                    g = (g==0)?1:g;
                    System.out.print(g+" ");
                    continue;
                }
                x+=2;
                System.out.print(x+" ");
            }
            k+=2;
            System.out.println();
        }
    }
}
