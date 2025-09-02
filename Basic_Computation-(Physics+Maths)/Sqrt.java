import java.util.*;
class Sqrt
{
    void Sqrt()
    {
        Scanner ob = new Scanner(System.in);
        int m,i,j;
        System.out.println("Enter the limit");
        m = ob.nextInt();
        int n[] = new int[m];
        System.out.println("Enter the numbers");
        for(i=0;i<m;i++)
        {
            n[i] = ob.nextInt();
        }
        for(i=0;i<m;i++)
        {
            j = (int)Math.sqrt(n[i]);
            if(j*j==n[i])
            System.out.println(n[i]+" is a perfect square of "+j);
        }
    }
    public static void main(String args[])
    {
        Sqrt obj = new Sqrt();
        obj.Sqrt();
    }
}
