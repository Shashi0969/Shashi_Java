import java.util.*;
class Duck_no
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int n,r,k=0;
        System.out.println("Enter the no.");
        n = ob.nextInt();
        while(n>0)
        {
            r = n%10;
            if(r==0)
            k++;
            n = n/10;
        }
        if(k>0)
        System.out.println("Duck no.");
        else
        System.out.println("Not a Duck no.");
    }
}
