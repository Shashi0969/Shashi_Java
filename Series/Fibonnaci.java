import java.util.*;
class Fibonnaci
{
    public static void main(String args_Series[]) throws Exception
    {
        Scanner ob = new Scanner(System.in);
        int n,a=0,b=1,p=0,s=0;
        System.out.println("Enter the limit of the series");
        n = ob.nextInt();
        System.out.print(a);
        while(b<=n)
        {
            p = a+b;
            a = b;//To store the value of b in a
            s = b+p;//To find the sum of a and b
            Thread.sleep(100);//To delay
            System.out.print(","+b);
            b = p;//To change b
        }
        System.out.println(";");
        System.out.println("Sum of the series = " +s);
    }
}
