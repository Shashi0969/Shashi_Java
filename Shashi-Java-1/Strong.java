import java.util.*;
class Strong 
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int i,j,n,f,s=0,t,r,m;
        System.out.println("Enter the no.");
        n = ob.nextInt();
        m=n;
        while(n>0)
        {
            f = 1;
            r = n%10;
            for(i=1;i<=r;i++)
            {
                f = f*i;
            }
            s = s+f;
            n = n/10;
        }
        if(s==m)
        System.out.println(m+" is a Strong no.");
        else
        System.out.println(m+" is not a Strong no.");
    }
}
