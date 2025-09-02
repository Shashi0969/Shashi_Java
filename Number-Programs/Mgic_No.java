import java.util.*;
class Mgic_No
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int n,i,s,r;
        System.out.println("Enter a no.");
        n = ob.nextInt();
        i = n;
        s=n;
        while(s>9)
        {
            n=s;
            s=0;
            while(n>0)
            {
                r = n%10;
                s = s+r;
                n = n/10;
            }
        }
        if(s==1)
        System.out.println(i+" is a Magic No.");
        else 
        System.out.println(i+" is not a Magic No.");
    }
}
