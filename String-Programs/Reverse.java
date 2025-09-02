// Program to Reverse a number and String
import java.util.*;
class Reverse 
{
    static int Reverse(int n)
    {
        int c,r,s=0,p=0;
        c = n;
        while (n>0)
        {
            r = n%10;//To find last digit
            s = s*10+r;//To reverse the number
            n = n/10;//To find the remaining digit other than last
        }
        p = s;
        return p;
    }
    static String Reverse2(String st)
    {
        String str,st2="";
        char ch;
        for(int i=st.length()-1;i>=0;i--)
        {
            ch = st.charAt(i);
            st2 = st2+ch;
        }
        str = st2;
        return str;
    }
    public static void main(String args[]) throws Exception
    {
        Scanner ob = new Scanner(System.in);
        String st,st2;
        int c=0,n=0;
        System.out.println("Enter the Number or String");
        st = ob.nextLine();
        Reverse obj = new Reverse();
        if(Character.isLetter(st.charAt(0))==true)
        {
            st2 = obj.Reverse2(st);
            System.out.println("Reversed String = "+st2);
            if(st2.compareTo(st)==0)
            System.out.println("The String "+st2+" is a Palindrome");
            else 
            System.out.println("The String "+st2+" is not a Palindrome");
        }
        else
        {
            n = Integer.parseInt(st);
            c = obj.Reverse(n);
            System.out.println("Reversed number =" +c);
            if (c==n)
            System.out.println("The number "+c+" is a Palindrome");
            else 
            System.out.println("The number "+c+" is not a Palindrome");
        }
    }
}
