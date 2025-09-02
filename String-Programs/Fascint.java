import java.util.*;
class Fascint
{
    void Fasc(int n)
    {
        int i,j=0,s2,b=0;
        long s,r=0;
        String st="";
        int m[] = new int[10];
        for(i=1;i<=9;i++)
        {
            m[i] = n*i;
            st = st+String.valueOf(m[i]);
        }
        s = Long.parseLong(st);
        System.out.println(s);
        for(i=1;i<=9;i++)
        {
            while(s>0)
            {
                r = s%10;
                if(r==i)
                j=1;
                s = s/10;
            }
            if(j==1)
            b++;
        }
        if(b==9)
        System.out.println(n+" is a fascinating no.");
        else 
        System.out.println(n+" is not a fascinating no.");
    }
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int p;
        System.out.println("Enter a no.");
        p = ob.nextInt();
        Fascint obj = new Fascint();
        obj.Fasc(p);
    }
}
