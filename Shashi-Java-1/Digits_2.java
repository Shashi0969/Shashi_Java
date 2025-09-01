import java.util.*;
class Digits_2
{
    public static void main(String Digits2[])
    {
        Scanner ob = new Scanner(System.in);
        int n,r,s=0;
        System.out.println("Enter the number");
        n = ob.nextInt();
        while(n>0)
        {
            r = n%10;
            s = s+1;
            n = n/10;
        }
        System.out.println("Number of digits =" +s);
    }
}
