import java.util.*;
class Series3 extends Series4
{
    public static void main(String Series3[])
    {
        Scanner ob =new Scanner(System.in);
        double a,i,j,n,k,s=0,p=0;
        System.out.println("Enter the value of a and limit");
        a = ob.nextDouble();
        n = ob.nextDouble();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                k = Math.pow(a,j);
                p = k/i;
                s = s+p;
            }
            System.out.println(p);
        }
        System.out.println("Sum =" +s);
    }
}
