import java.util.*;
class Sunny
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int n;
        double p;
        System.out.println("Enter the no.");
        n = ob.nextInt();
        p = Math.sqrt(n+1);
        if((int)p==p)
        System.out.println(n+" is a Sunny no.");
        else
        System.out.println(n+" is not a Sunny no.");
    }
}
