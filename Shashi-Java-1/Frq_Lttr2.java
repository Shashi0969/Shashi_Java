import java.util.*;
class Frq_Lttr2
{
    public static void main(String Frq_Lttr2[])
    {
        Scanner ob = new Scanner(System.in);
        String st,st1="";
        char ch,ch1=' ';
        int p,i,j;
        System.out.println("Enter the Sentence");
        st = ob.nextLine();
        p = st.length();
        st = st.toUpperCase();
        int m[] = new int[26];
        for(i=0;i<26;i++)
        {
            m[i]=0;
        }
        for(i=0;i<p;i++)
        {
            ch = st.charAt(i);
            if(ch>=65&&ch<=90)
            m[ch-65]++;
        }
        System.out.println("Character \t Frequency");
        for(i=0;i<26;i++)
        {
            if(m[i]!=0)
            System.out.println((char)(i+65)+"\t\t "+m[i]);
        }
    }
}
