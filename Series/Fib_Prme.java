import java.util.*;
class Fib_Prme
{
    public static void main(String args_Prime[]) throws Exception
    {
        Scanner ob = new Scanner(System.in);
        int n,a=1,b=1,p=0,s=0,i,c=0;
        System.out.println("Enter the limit of the series");
        n = ob.nextInt();
        while(b<=n) //To find fibonnaci Series
        {
            c=0;
            for(i=1;i<=b;i++)
            {
                if(b%i==0) //To find factors of b
                c = c+1;
            }
            if(c==2) //To find prime factor
            {
                p = a+b;
                a = b; //To interchange a and b
                Thread.sleep(100);
                System.out.print(b+",");
                s = b+p; //To find sum of prime factors in fibonnaci
                b = p;
            }
            else
            b++;
        }
        System.out.println(";");
        System.out.println("Sum of the series = " +s);
    }
    
}
