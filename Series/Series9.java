import java.util.*;
class Series9 extends Triangl_S
{
    public static void main(String Series_9[])
    {
        Scanner ob = new Scanner(System.in);
        double a,n,i,j,sign=1;
        double p=0,s=0;
        System.out.println("Enter the value of a and limit");
        a = ob.nextDouble();
        n = ob.nextDouble();
        for(i=1;i<=n;i+=4)
        {
            for(j=1;j<=i-2;j+=2)
            {
                a = Math.pow(a,j);
                p = a/i*sign;
                sign = sign*-1;
                s = s+p;
            }
            System.out.println(p);
        }
        System.out.printf("Sum =%.2f" ,s);
    }
}
