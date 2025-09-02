import java.util.*;
class Factorial
{
    void Factorial()
    {
        Scanner ob = new Scanner(System.in);
        int n,f=1,i=1;
        System.out.println("Enter the number");
        n = ob.nextInt();
        while (i<=n)
        {
            f = f*i;
            i++;
        }
        System.out.println("Factorial of "+n+" ="+f);
    }
    public static void main(String Factorial[])
    {
        Factorial obj = new Factorial();
        obj.Factorial();
    }
}
