import java.util.*;
class Pattern
{
    void Pattern(int i,int j,int n)
    {
         if(i<=n)
         {
             if(j<=i)
             {
                 System.out.print(j+" ");
                 j++;
                 Pattern(i,j,n);
             }
             else
             {
                 i++;
                 System.out.println();
                 Pattern(i,1,n);
             }
         }
    }
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int i,j,n;
        System.out.println("Enter the limit");
        n = ob.nextInt();
        i=1;
        j=1;
        Pattern obj = new Pattern();
        obj.Pattern(i,j,n);
    }
}
