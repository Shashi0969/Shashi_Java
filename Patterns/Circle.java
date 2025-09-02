import java.util.*;
class Circle
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int i,j,k=4,p=9;
        System.out.println("Enter the limit");
        for(i=1;i<=3;i++)
        {
            for(j=1;j<=k;j++)
            System.out.print(" ");
            for(j=1;j<=p;j++)
            System.out.print("* ");
            System.out.println();
            p++;
            if(i==1)
            {
                p++;
                k--;
            }
            k--;
        }
        for(i=1;i<=3;i++)
        {
            for(j=1;j<=p;j++)
            System.out.print("* ");
            System.out.println();
        }
        p--;
        k++;
        for(i=1;i<=3;i++)
        {
            for(j=1;j<=k;j++)
            System.out.print(" ");
            for(j=1;j<=p;j++)
            System.out.print("* ");
            System.out.println();
            p--;
            k++;
        }
    }
}
