import java.util.*;
class Series1 extends Series2
{
    public static void main(String Series1[])
    {
        Scanner ob = new Scanner(System.in);
        double n,i,a,s=0,p=0;
        System.out.println("Enter the limit");
        n = ob.nextDouble();
        for(i=1;i<=n;i++)
        {
            for(a=2;a<=i+1;a++)
            {
                p = i/a;
                s = s+p;
            }
            System.out.println(p);
        }
        System.out.println("Sum =" +s);
    }
}
