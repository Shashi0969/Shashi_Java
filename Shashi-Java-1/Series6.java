import java.util.*;
class Series6 extends Series7
{
    public static void main(String Series6[])
    {
        Scanner ob = new Scanner(System.in);
        int n,i,m=1;
        double s=0,p=1,j=1,k;
        System.out.println("Enter the limit");
        n = ob.nextInt();
        for(i=2;i<=n;i++)
        {
            p = p+i;
            j = j*i;
            k = p/j;
            s = s+k;
            System.out.println(k);
        }
        System.out.printf("Sum =%.2f" ,s);
    }
}
