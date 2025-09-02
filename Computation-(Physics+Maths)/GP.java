import java.util.*;
class GP
{
    void GP()
    {
        Scanner ob = new Scanner(System.in);
        double gp=0,a,n,r,j;
        System.out.println("Enter the first term,no. of terms and common ratio of the GP");
        a = ob.nextDouble();
        n = ob.nextDouble();
        r = ob.nextDouble();
        gp=a;
        System.out.println(a);
        for(int i=1;i<=n-1;i++)
        {
            j = a*Math.pow(r,i);
            gp = gp+j;
            System.out.println(j);
        }
        System.out.println("Sum of the GP ="+gp);
    }
    public static void main(String args[])
    {
        GP obj = new GP();
        obj.GP();
    }
}
