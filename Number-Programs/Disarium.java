import java.util.*;
class Disarium
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int i,n,s=0,r,m;
        double p;
        System.out.println("Enter a no.");
        n = ob.nextInt();
        m=n;
        i = Integer.toString(n).length();
        while(n>0)
        {
            r = n%10;
            p = Math.pow(r,i);
            s = s+(int)p;
            n = n/10;
            i--;
        }
        if(s==m)
        System.out.println(m+" is a Disarium no.");
        else 
        System.out.println(m+" is not a Disarium no.");
    }
}
