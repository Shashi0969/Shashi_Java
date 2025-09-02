import java.util.*;
class Fibnci_2
{
    public static void main(String args_Probability[]) throws Exception
    {
        Scanner ob = new Scanner(System.in);
        int n,a=0,b=1,p=0,s=0,i=0;
        System.out.println("Enter the no.");
        n = ob.nextInt();
        while(b<=n)
        {
            p = a+b;
            a = b;
            b = p;
            i++;
            if(b==n)
            {
                s=1;
                System.out.println("The number is present in the fibonnaci series at index " +i);
                break;
            }
        }
        if(s==0)
        System.out.println("The number is not present in the fibonnaci series");
    }
}
