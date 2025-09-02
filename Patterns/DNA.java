import java.util.*;
class DNA
{
    public static void main(String DNA[]) throws Exception
    {
        Scanner ob = new Scanner(System.in);
        int n,i,j,k,m,p;
        for(int l=1;l>0;l++)
        {
            System.out.println("Enter the number of crosses");
            p = ob.nextInt();
            System.out.println("Enter the limit of each cross");
            n = ob.nextInt();
            System.out.println("Structure of DNA");
            for(m=1;m<=p;m++)
            for(k=1;k<99999999;k++)
            {
                for(i=1;i<=n;i++)
                {
                    {
                        for(k=1;k<99999999;k++);
                    }
                    {
                        for(j=1;j<=n;j++)
                        {
                            if(i==j||i+j==n+1)
                            System.out.print("*");
                            else
                            System.out.print(" ");
                        }
                        System.out.println();
                    }    
                }
            }
            if(p==0||n==0)
            {
                System.out.println("\t\t\tTerminated");
                break;
            }
        }
    }
}