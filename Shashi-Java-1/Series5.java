import java.util.*;
import java.lang.*;
class Series5 extends Series6
{
    public static void main(String Series5[])
    {
        Scanner ob = new Scanner(System.in);
        double n,i,s=0,p=0;
        System.out.println("Enter the limit");
        n = ob.nextDouble();
        for(i=1;i<=n;i++)
        {
            p = p+i;
            s = s+p;
            System.out.println(p);
        }
        System.out.println("Sum =" +s);
    }
}
