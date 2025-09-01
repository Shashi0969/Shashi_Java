import java.util.*;
class Perfect
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int i,j,s=0,n;
        System.out.println("Enter the no.");
        n = ob.nextInt();
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            s+=i;
        }
        if(s==n)
        System.out.println(n+" is a Perfect no.");
        else
        System.out.println(n+" is not a Perfect no.");
    }
}
