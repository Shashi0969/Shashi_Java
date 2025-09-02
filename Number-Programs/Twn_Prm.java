import java.util.*;
class Twn_Prm
{
    int Twin_Prime(int p)
    {
        int c=0,k,i;
        for(i=1;i<=p;i++)
        {
            if(p%i==0)
            c++;
        }
        if(c==2)
        return k=1;
        else 
        return k=0;
    }
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int p,q,a,b;
        System.out.println("Enter the two no.s");
        p = ob.nextInt();
        q = ob.nextInt();
        Twn_Prm obj = new Twn_Prm();
        a = obj.Twin_Prime(p);
        b = obj.Twin_Prime(q);
        if((a==1&&b==1)&&(p-q==2||q-p==2))
        System.out.println(p+" & "+q+" are Twin Primes");
        else 
        System.out.println(p+" & "+q+" are not Twin Primes");
    }
}
