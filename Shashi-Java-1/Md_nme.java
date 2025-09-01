import java.util.*;
class Md_nme
{
    public static void main(String args[]) throws Exception
    {
        Scanner ob = new Scanner(System.in);
        for(int k=1;k>0;k++)
        {
        String st,s3=" ",s4=" ",st1=" ",st2=" ";
        char ch,ch2,ch3=' ';
        int i,p,s,s2;
        System.out.println("Enter the three words' Name");
        st = ob.nextLine();
        s = st.indexOf(" ");
        s2 = st.lastIndexOf(" ");
        p = st.length();
        s4 = st.substring(s2,p);
        {
            for(i=0;i<s;i++)
            {
                ch = st.charAt(i);
                s3 = s3+ch;
            }
        }
        st2 = s3+s4;
        ch3 = st.charAt(0);
        if(Character.isWhitespace(ch3)==true)
        {
            System.out.println("\t\tTerminated");
            break;
        }
        else
        System.out.println("Name after removing the middle name =" +st2);
    }
    }
}
