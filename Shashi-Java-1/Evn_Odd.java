import java.util.*;
class Evn_Odd
{
    void Even_Odd()
    {
        Scanner ob = new Scanner(System.in);
        int n,r,i=1,s=0;
        System.out.println("Enter the limit");
        n = ob.nextInt();
        System.out.println(n/2+" Even numbers between 0 and "+n+"  "+"\t"+n/2+" Odd numbers between 0 and "+n);
        System.out.println();
        while (i<=n)
        {
            System.out.println(s+"\t"+"\t"+"\t"+"\t"+"\t"+i);
            i = i+2;
            s = s+2;
        }
    }
    public static void main(String args[])
    {
        Evn_Odd obj = new Evn_Odd();
        obj.Even_Odd();
    }
}
