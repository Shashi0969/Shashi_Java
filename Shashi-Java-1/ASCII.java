import java.util.*;
class ASCII
{
    void ASCII()
    {
        Scanner ob = new Scanner(System.in);
        for(int k=1;k>0;k++)
        {
            String st,s=" ";
            char ch=' ';
            int p,i,m;
            System.out.println("Enter the String");
            st = ob.nextLine();
            p = st.length();
            for(i=0;i<p;i++)
            {
                ch = st.charAt(i);
                m = (int)ch;
                System.out.println("ASCII value of "+ch+ "=" +m);
            }
            if (Character.isWhitespace(ch)==true)
            break;
        }
    }
    void Ascii()
    {
        Scanner ob = new Scanner(System.in);
        for(int k=1;k>0;k++)
        {
            int n;
            System.out.println("Enter the no.");
            n = ob.nextInt();
            System.out.println((char)n);
            if(n==0)
            break;
        }
    }
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int p;
        System.out.println("Enter your Choice\n1. ASCII Code of given characters\n2. Character");
        p = ob.nextInt();
        ASCII obj = new ASCII();
        if(p==1)
        obj.ASCII();
        else if(p==2)
        obj.Ascii();
        else
        System.out.println("Wrong Choice");
    }
}
