import java.util.*;
class Factorial_Reciprocal
{
    public static void main(String Factorial_2[])
    {
        Scanner ob = new Scanner(System.in);
        int a,b,n;
        double s=0,p;
        System.out.println("Enter the value of n");
        n = ob.nextInt();
        for(a=1;a<=n;a++)
        {
            int f=1;
            for(b=1;b<=a;b++)
            {
                f = f*b;
            }
            s = s+(double)1/f;
            p = (double)1/f;
            System.out.println(p);
        }
        System.out.println("Sum = "+s);
    }
}
