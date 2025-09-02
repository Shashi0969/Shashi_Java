// Program to convert a Decimal number to Binary
import java.util.*;
class Binary 
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int n,r;
        String st="";
        System.out.println("Enter the no.");
        n = ob.nextInt();
        while(n>0)
        {
            r = n%2;
            st = st+Integer.toString(r);
            n = n/2;
        }
        Reverse ob1 = new Reverse(); // Revervse object for Reverse class
        System.out.println(ob1.Reverse2(st)); // Call Reverse2 function to reverse String
    }
}
