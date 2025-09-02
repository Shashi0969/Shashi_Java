import java.util.*;
class Series4 extends Series5
{
    public static void main(String Series4[])
    {
        Scanner ob = new Scanner(System.in);
        double a,i,n,j,s=0,p=0;
        System.out.println("Enter the value of a and limit");
        a = ob.nextDouble();
        n = ob.nextDouble();
        for(i=1;i<=n;i+=2)
        {
            for(j=2;j<=i+1;j+=2)
            {
                p = i-a/j;
                s = s+p;
            }
            System.out.println(p);
        }
        System.out.println("Sum =" +s);
    }
}
