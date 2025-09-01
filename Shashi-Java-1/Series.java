import java.util.*;
class Series extends Series1
{
    public static void main(String Series[])
    {
        Scanner ob = new Scanner(System.in);
        int n,i,s=0,sign = 1,p=0;
        System.out.println("Enter the limit");
        n = ob.nextInt();
        for(i=2;i<=n;i+=2)
        {
            p = i*sign;
            s = s+p;
            sign = sign*-1;
            System.out.println(p);
        }
        System.out.println("Sum =" +s);
    }
}
