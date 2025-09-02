import java.util.*;
class Atmrphic
{
    void Automorphic(int m)
    {
        int p,c=0,m2;
        double k=0;
        p = m*m;
        m2=m;
        while(m>0)
        {
            m=m/10;
            c++;
        }
        k = p%(Math.pow(10,c));
        if((int)k==m2)
        System.out.println(m2+" is an Automorphic no.");
        else 
        System.out.println(m2+" is not an Automorphic no.");
    }
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int m;
        System.out.println("Enter a no.");
        m = ob.nextInt();
        Atmrphic obj = new Atmrphic();
        obj.Automorphic(m);
    }
}
