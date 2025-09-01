import java.util.*;
class Digits
{
    int c=1;
    int Count(int n)
    {
        int r;
        r = n/10;
        if(r==0)
        return c;
        else
        {        
            n = n/10;
            c++;
            return Count(n);
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number");
        n = sc.nextInt();
        Digits ob = new Digits();
        System.out.println("No. of Digits =" +ob.Count(n));
    }
}
