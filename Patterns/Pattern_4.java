import java.util.*;
class Pattern_4
{
    public static void main(String Floyd_Triangle[]) 
    {
        Scanner ob = new Scanner(System.in);
        int n,i,j,m,p,k;
        System.out.println("Enter the limit of the pattern");
        n = ob.nextInt();
        k = n;
        System.out.println("Pascal's Triangle");
        for(i=1;i<=n;i++)
        {
            for(int l=1;l<99999999;l++);
            for(p=k;p>=1;p--)
            {
                for(int l=1;l<99999999;l++);
                System.out.print("  ");
            }
            for(j=1;j<=i;j++)
            {
                for(int l=1;l<99999999;l++);
                System.out.print(j+" ");
            }
            for(m=j-2;m>=1;m--)
            {
                System.out.print(m+" ");
            }
            System.out.println();
            k--;
        }
    }
}