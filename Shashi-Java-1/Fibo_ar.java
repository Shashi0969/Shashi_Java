import java.util.*;
class Fibo_ar
{
    public static void main(String Fibo_Array[]) throws Exception
    {
        Scanner ob = new Scanner(System.in);
        int n,j=0,a=0,b=1,p,s=0,i=0,c=0,k=0;
        System.out.println("Enter the limit of the series");
        n = ob.nextInt();
        int m[] = new int[n];
        while(j<n) //To find fibonnaci Series
        {
            p = a+b;
            m[j]=a;
            a = b; //To interchange a and b
            s = b+p; //To find sum of prime factors in fibonnaci
            j++;
            b = p;
        }
        for(j=0;j<n;j++)
        {
            Thread.sleep(100);
            System.out.print(m[j]+",");
        }
    }
}
