import java.util.*;
class Keith
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int n,r,a,p=0,i,j,sum;
        System.out.println("Enter a no.");
        n = ob.nextInt();
        a=n;
        p = Integer.toString(n).length();
        i=p;
        p--;
        int m[] = new int[10];
        while(n>0)
        {
            r = n%10;
            m[p]=r;
            p--;
            n = n/10;
        }
        p=i;
        n = a;
        sum=0;
        while(sum<n)
        {
            sum=0;
            for(j=1;j<=p;j++)
            {
                sum=sum+m[i-j];
            }
            m[i] = sum;
            i++;
            System.out.println(sum);
        }
        if(sum==n)
        System.out.println("Keith no.");
        else
        System.out.println("Not a Keith no.");
    }
}
