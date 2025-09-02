import java.util.*;
class Mth_cnct
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        long a,b,n,s=0;
        System.out.println("Enter the two numbers");
        a = ob.nextLong();
        b = ob.nextLong();
        n = b;
        while(n>0)
        {
            s = s+1;
            n = n/10;
        }
        double p = a*Math.pow(10,s);
        double concat = p+b;
        System.out.println("Concatanated value =" +(long)Math.abs(concat));
    }
}
