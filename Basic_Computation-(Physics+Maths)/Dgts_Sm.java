import java.util.*;
class Dgts_Sm
{
    public static void main(String sum[])
    {
        Scanner ob = new Scanner(System.in);
        int n,r,s=0;
        System.out.println("Enter the number");
        n = ob.nextInt();
        while (n>0)
        {
            r = n%10;
            s = s+r;
            n = n/10;
        }
        System.out.println("Sum of digits =" +s);
    }
}
