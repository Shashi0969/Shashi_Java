import java.util.*;
class Anagram
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int i,j,p,t=0,q;
        char ch,ch1;
        String st,s,st1="";
        System.out.println("Enter the First Word");
        st = ob.nextLine();
        System.out.println("Enter the Second Word");
        s = ob.nextLine();
        p = st.length();
        q = s.length();
        StringBuffer obj = new StringBuffer(s);
        if(p==q)
        {
            for(i=0;i<p;i++)
            {
                t=0;
                ch = st.charAt(i);
                for(j=0;j<p;j++)
                {
                    ch1 = s.charAt(j);
                    if(ch1==ch)
                    {
                        obj.delete(j,j+1);
                        t=1;
                        break;
                    }
                }
                if(t==0)
                break;
            }
        }
        if(t==1)
        System.out.println(st+" and "+s+" are Anagram Words");
        else
        System.out.println(st+" and "+s+" are not Anagram Words");
    }
}
