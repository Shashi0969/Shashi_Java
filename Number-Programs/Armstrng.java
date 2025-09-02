import java.util.*;
class Armstrng
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("A number is said to be Armstrong if the sum of the cubes of it's digits is equal to the original number");
        int n,c,r,s=0;
        System.out.println("Enter the number");
        n = ob.nextInt();
        c = n;
        while (n>0)
        {
            r = n%10;
            s = s+r*r*r;
            n = n/10;
        }
        System.out.println("Sum of cubes of digits =" +s);
        if (c==s)
        System.out.println(c+ " is a Armstrong number");
        else 
        System.out.println(c+ " is not an Armstrong number");
    }
}
