import java.util.*;
class Trmrphc
{
    public static void main(String Trimorphic_No[])
    {
        Scanner ob = new Scanner(System.in);
        int n,p,c,r;
        System.out.println("Enter a no.");
        n = ob.nextInt();
        p = Integer.toString(n).length();
        c = n*n*n;
        r = c%(int)Math.pow(10,p);
        if(r==n)
        System.out.println(n+" is a Trimorphic no.");
        else 
        System.out.println(n+" is not a Trimorphic no.");
    }
}
