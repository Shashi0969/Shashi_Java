import java.util.*;
class Pttrn
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        String st,s="";
        char ch,c;
        int i,p,j;
        System.out.println("Enter the String");
        st = ob.nextLine();
        p = st.length();
        Reverse obj = new Reverse();
        for(i=0;i<p;i++)
        {
            ch = st.charAt(i);
            for(j=0;j<p;j++)
            {
                c = st.charAt(j);
                if(c==ch)
                continue;
                s = s+c;
            }
        }
    }
}
