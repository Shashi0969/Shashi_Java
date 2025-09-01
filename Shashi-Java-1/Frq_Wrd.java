import java.util.*;
class Frq_Wrd
{
    public static void main(String Frq_Wrd[])
    {
        Scanner ob = new Scanner(System.in);
        String st,st1,st2="";
        int i,p,t=0;
        char ch;
        System.out.println("Enter the sentence");
        st = ob.nextLine();
        System.out.println("Enter the word to be searched");
        st1 = ob.nextLine();
        p = st.length();
        for(i=0;i<p;i++)
        {
            ch = st.charAt(i);
            if(ch==' ')
            {
                if(st2.compareTo(st1)==0)
                t++;
                st2 = "";
            }
            else
            st2 = st2+ch;
        }
        System.out.println("Frequecy =" +t);
    }
}
