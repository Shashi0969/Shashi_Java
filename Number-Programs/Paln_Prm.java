import java.util.*;
class Paln_Prm
{
    int n,p,rev,c=0,n2,s=0;
    Paln_Prm(int num)
    {
        n = num;
        n2 = n;
    }
    int Prime()
    {
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            c++;
        }
        if(c==1)
        return 1;
        else 
        return 0;
    }
    int reverse()
    {
        int r,k;
        while (n>0)
        {
            r = n%10;//To find last digit
            s = s*10+r;//To reverse the number
            n = n/10;//To find the remaining digit other than last
        }
        k = s;
        return k;
    }
    void Display()
    {
        rev = reverse();
        p = Prime();
        if(p==1&&rev==n2)
        System.out.println(n2+" is a Palindrome Prime");
        else
        System.out.println(n2+" is not a Palindrome Prime");
    }
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int n;
        System.out.println("Enter the no.");
        n = ob.nextInt();
        Paln_Prm obj = new Paln_Prm(n);
        obj.Prime();
        obj.reverse();
        obj.Display();
    }
}
