import java.util.*;
class Hpy_Wrd
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        String st,st1=" ",st2,s=" ";
        char ch,ch2=' ',ch3=' ';
        int i,j,p,p2,m=0,n=0,k=0;
        System.out.println("Enter a String");
        st = ob.nextLine();
        p = st.length();
        for(i=0;i<p;i++)
        {
            ch = st.charAt(i);
            if(Character.isUpperCase(ch)==true)
            m = ((int)ch)-64;
            else
            m = ((int)ch)-96;
            s = Integer.toString(m);
            st1 = st1+s;
        }
        st2 = st1;
        p2 = st2.length();
        for(j=0;j<p;j++)
        {
            ch3 = st2.charAt(j);
            n = n*n+(int)ch3*ch3;
            if(n==1)
            {
                k=0;
                System.out.println("A Happy Word");
                break;
            }
            else 
            k=1;
        }
        if(k==1)
        System.out.println("Not A Happy Word");
    }
}
