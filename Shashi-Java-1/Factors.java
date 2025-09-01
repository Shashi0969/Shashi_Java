import java.util.*;
class Factors extends Factorial
{
    void Factors()
    {
        Scanner ob = new Scanner(System.in);
        int i=2,j,f,n;
        System.out.println("Enter the number");
        n = ob.nextInt();
        int p = n;
        f = n-p+2;
        System.out.print("Prime Factors of "+p+" are :");
        while(n>f)
        {
            if(n%i==0)
            {
                n = n/i;
                System.out.print(i+",");
            }
            else 
            i++;
        }
        System.out.println();
        n = p;
        System.out.print(n+" is divisible by :");
        for(i=1;i<=n;i++)
        { 
            if(n%i==0)
            {
                f = f*i;
                System.out.print(i+" ");
                if(f==n)
                break;
            }
        }
        System.out.println(";");
    }
    public static void main(String Factors[])
    {
        Factors obj = new Factors();
        obj.Factors();
    }
}
