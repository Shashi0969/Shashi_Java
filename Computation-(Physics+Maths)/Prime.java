import java.util.*;
class Prime
{
    void Prime_()
    {
        Scanner ob = new Scanner(System.in);
        int a,b,c,n,n2=1,k=1,i=1;
        System.out.println("Enter the limit of prime numbers");
        n = ob.nextInt();
        System.out.println("The prime numbers till "+n+" are:");
        System.out.println("1.  1");
        while(k<=n)
        {
            c=0;
            for(a=1;a<=n2;a++)
            {
                if(n2%a==0)
                c = c+1;
            }
            if(c==2)
            {
                i++;
                System.out.println(i+".  "+n2+" ");
            }
            n2=n2+1;
            k = k+1;
        }
    }
    void Prime2()
    {
        Scanner ob = new Scanner(System.in);
        int a,b,c,n,n2=1,k=1,i=1;
        System.out.println("Enter the limit of prime numbers");
        n = ob.nextInt();
        System.out.println("The prime numbers till "+n+" are:");
        System.out.println("1.  1");
        while(k<n)
        {
            c=0;
            for(a=1;a<=n2;a++)
            {
                if(n2%a==0)
                c = c+1;
            }
            if(c==2)
            {
                k++;
                i++;
                System.out.println(i+".  "+n2+" ");
            }
            n2=n2+1;
        }
    }
    void Prime()
    {
        Scanner ob = new Scanner(System.in);
        Prime obj = new Prime();
        System.out.println("Enter your choice");
        System.out.println("1. Till no.\n2. Till limit");
        int n = ob.nextInt();
        if(n==1)
        obj.Prime_();
        else if(n==2)
        obj.Prime2();
        else
        System.out.println("Wrong Choice");
    }
    public static void main(String Prime[])
    {
        Prime obj = new Prime();
        obj.Prime();
    }
}
