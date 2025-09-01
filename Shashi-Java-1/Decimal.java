import java.util.*;
class Decimal
{
    public static void main(String args[])
    {      
        Scanner ob = new Scanner(System.in);
        String st;
        int n,i=0;
        double d,s=0,r;
        System.out.println("Enter the no.");
        n = ob.nextInt();
        while(n>0)
        {
            r = n%10;
            d = r*Math.pow(2,i);
            s = s+d;
            n = n/10;
            i++;
        }
        System.out.println((int)s);
    }
}
