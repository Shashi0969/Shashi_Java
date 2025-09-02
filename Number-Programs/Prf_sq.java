// Program to take 10 numbers as input and determine which number is a perfect square of some other number
import java.util.*;
class Prf_sq
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int i,p=0;
        double sq;
        int m[] = new int[10];
        int n[] = new int[10];
        System.out.println("Enter elements in array");
        for(i=0;i<10;i++)
        m[i] = ob.nextInt();
        for(i=0;i<10;i++)
        {
            sq = Math.sqrt(m[i]);
            if((int)sq*sq==m[i])
            {
                n[p] = m[i];
                p++;
            }
        }
        for(i=0;i<p;i++)
        System.out.println(n[i]);
    }
}
