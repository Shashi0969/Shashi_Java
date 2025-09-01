import java.util.*;
class Glcm
{
    public static void main(int a,int b)
    {
        int p,r,i,gcd,lcm,c;
        p = a*b;
        if(a<b)
        {
            a=b;
            c=a;
            b=c;
        }
        c=a/b;
        gcd = a/b;
        while(gcd>0)
        {
            gcd = a/b;
            a = b;
            if(gcd>0)
            b = gcd;
        }
        System.out.println(b);
        lcm = p/(b*c);
        System.out.println(lcm);
    }
}
