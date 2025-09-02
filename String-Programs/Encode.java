import java.util.*;
class Encode
{
    void Encode()
    {
        Scanner ob = new Scanner(System.in);
        int i,p,e;
        char ch,ch1;
        String st,st1="";
        System.out.println("Enter the String ");
        st = ob.nextLine();
        System.out.println("Enter the Encode");
        e = ob.nextInt();
        p = st.length();
        for(i=0;i<p;i++)
        {
            ch = st.charAt(i);
            ch1 = (char)((int)ch+e);
            if(Character.isUpperCase(ch)==true)
            {
                if(ch1>90)
                ch1 = (char)((int)ch1-26);
                else if(ch1<65)
                ch1 = (char)((int)ch1+26);
                else
                ch1 = ch1;
            }
            else if(Character.isLowerCase(ch)==true)
            {
                if(ch1>122)
                ch1 = (char)((int)ch1-26);
                else if(ch1<97)
                ch1 = (char)((int)ch1+26);
                else
                ch1 = ch1;
            }
            st1 = st1+ch1;
        }
        System.out.println("New Word =" +st1);
    }
    public static void main(String args[])
    {
        Encode obj = new Encode();
        obj.Encode();
    }
}
