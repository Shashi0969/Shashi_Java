import java.util.*;
class Prime
{
    static int i=2;
    static int Prime(int n)
    {    
        if(n%i==0)
        {
            i++;
            return Prime(n);
        }
        else
        return i-1;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,c;
        System.out.println("Enter the number");
        n = sc.nextInt();
        Prime ob = new Prime();
        c = ob.Prime(n);
        if(c==1)
        System.out.println("The number is prime");
        else 
        System.out.println("THe number is not prime");
    }
}
