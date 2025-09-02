import java.util.*;
class AP
{
    void AP()throws Exception
    {
        Scanner ob = new Scanner(System.in);
        int i=2,a,j,d,n,ap=0,sn=0;
        System.out.println("Enter the first term common difference of AP and no.of terms :");
        a = ob.nextInt();
        d = ob.nextInt();
        n = ob.nextInt();
        System.out.println("The series is :");
        System.out.print(a);
        while(i<=n+1)
        {
            ap = a+(i-1)*d;
            sn = sn+ap;
            System.out.print("+"+ap);
            i++;
        }
        System.out.println();
        System.out.println("Sum of the series is : " +(long)(sn+a));
    }
    public static void main(String args[]) throws Exception
    {
        AP obj = new AP();
        obj.AP();
    }
}
