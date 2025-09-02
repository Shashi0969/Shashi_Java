import java.util.*;
class Series8 extends Series9
{
    public static void main(String Series_8[])
    {
        Scanner ob = new Scanner(System.in);
        int a,n,i;
        double p=0,s=0;
        System.out.println("Enter the value of a and limit");
        a = ob.nextInt();
        n = ob.nextInt();
        for(i=1;i<=n;i++)
        {
            p = a+i;
            s = s+p;
            System.out.println(p);
        }
        System.out.println("Sum =" +s);
    }
}
