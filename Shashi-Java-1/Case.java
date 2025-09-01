import java.util.*;
class Case
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        String st,s="";
        int i,p;
        char ch,c;
        st = ob.nextLine();
        st = " "+st;
        p = st.length();
        for(i=0;i<p;i++)
        {
            ch = st.charAt(i);
            ch = Character.toLowerCase(ch);
            if(ch==' ')
            {
                c = st.charAt(i+1);
                s = s+" "+Character.toUpperCase(c);
                i++;
            }
            else 
            s = s+ch;
        }
        System.out.println("New String :" +s);
    }
}
