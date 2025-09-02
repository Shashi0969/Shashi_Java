import java.util.*;
import java.lang.*;
class Sqr_Root extends Sqrt
{
    void Square_Root()
    {
        Scanner ob = new Scanner(System.in);
        double n,i=1;
        double k,s=0;
        int l=0,m;
        System.out.println("Enter your Choice");
        System.out.println("1. Square Roots till limit\n2.Check Perfect Square");
        m = ob.nextInt();
        switch(m)
        {
            case 1:
            System.out.println("Enter the limit");
            n = ob.nextDouble();
            while (i<=n)
            {
                {
                    for(k=1;k<9999999;k++);
                }
                k = Math.sqrt(i);
                System.out.println("Square root of "+i+" is");
                System.out.printf("= %.3f",k);
                System.out.println();
                i++;
            }
            break;
            case 2:
            System.out.println("Enter the limit");
            n = ob.nextDouble();
            Sqrt obj = new Sqrt();
            obj.Sqrt();
            break;
            default:
            System.out.println("Wrong Choice");
        }
    }
    public static void main(String args[])
    {
        Sqr_Root obj = new Sqr_Root();
        obj.Square_Root();
    }
}
