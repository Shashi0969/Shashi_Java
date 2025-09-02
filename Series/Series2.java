import java.util.*;
class Series2 extends Series3
{
    public static void main(String Series2[])
    {
        Scanner ob = new Scanner(System.in);
        int n,i,a;
        double s=0,p=0;
        System.out.println("Enter the limit");
        n = ob.nextInt();
        for(i=1;i<=n;i+=2)
        {
            for(a=1;a<=i;a+=i)
            {
                p = i/a;
                s = s+p;
            }
            System.out.println(p);
        }
        System.out.println("Sum =" +s);
    }
}
