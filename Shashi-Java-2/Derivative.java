import java.util.*;
class Derivative
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        Reverse ob1=new Reverse();
        double x1;
        String y,dydx,s="";
        System.out.println("Enter the function");
        y = ob.nextLine();
        System.out.println("Enter the value of x");
        x1 = ob.nextDouble();
        char m[]= new char [y.length()];
        for(int i=0;i<y.length();i++)
        {
            m[i]=y.charAt(i);
        }
        for(i=0;i<y.length();i++)
        {
            if(m[i]=='x'&&i>1)
            {
                if(Character.isDigit(m[i-1])==true)
                {
                    for(int j=i;j>=0;j--)
                    {
                        if(Character.isDigit(m[j])==false)
                        {
                            break;
                        }
                        s=s+m[j];
                    }
                    s=ob1.Reverse(s);
    }
}
