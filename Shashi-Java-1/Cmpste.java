import java.util.*;
class Cmpste
{
    void Composite()
    {
        Scanner ob = new Scanner(System.in);
        int a,c=0,i;
        System.out.println("Enter the no.");
        a = ob.nextInt();
        for(i=2;i<a;i++)
        {
            if(a%i==0)
            c++;
        }
        if(c>1)
        System.out.println(a+" is a composite no.");
        else 
        System.out.println(a+" is not a composite no.");
    }
    public static void main(String args[])
    {
        Cmpste obj = new Cmpste();
        obj.Composite();
    }
}
