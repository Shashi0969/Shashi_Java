import java.util.*;
class Series7 extends Series8
{
    public static void main(String Series_7[])
    {
        Scanner ob = new Scanner(System.in);
        int a,n,i;
        double j=2,k=2,p=0,s=0;
        System.out.println("Enter the value of a and limit");
        a = ob.nextInt();
        n = ob.nextInt();
        for(i=2;i<=n;i+=2)
        {
            p = a/k;
            s = s+p;
            k = i*j;
            System.out.println(p);
        }
        System.out.printf("Sum =%.2f" ,s);
    }
}
