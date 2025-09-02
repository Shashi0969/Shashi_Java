// Program to calculate HCF and LCM
import java.util.*;
class HcfLcm
{
    int a,b,lcm,hcf=1,max,min,k,z;
    HcfLcm(int x,int y)
    {
        a=x;
        b=y;
        if(a<b)
        min=a;
        else 
        min=b;
    }
    void calculate()
    {
        int i;
        for(i=min;i>=1;i--)
        {
            if(a%i==0&&b%i==0)
            {
                k = i;
                break;
            }
        }
        if(a>b)
        {
            max=a;
            min=b;
        }
        else
        {
            max=b;
            min=a;
        }
        for(i=1;i<=max;i++)
        {
            z = max*i;
            if(z%min==0)
            {
                lcm = z;
                break;
            }
        }
    }
    void display()
    {
        System.out.println("LCM = "+lcm);
        System.out.println("HCF = "+k);
    }
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int p,q;
        System.out.println("Enter the two no.s");
        p = ob.nextInt();
        q = ob.nextInt();
        HcfLcm obj = new HcfLcm(p,q);
        obj.calculate();
        obj.display();
    }
}