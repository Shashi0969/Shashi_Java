import java.util.*;
class Piglatin
{
    void Piglatin()
    {
        Scanner ob = new Scanner(System.in);
        int i,p;
        String st,st1,st2;
        char ch;
        System.out.println("Enter the Word");
        st = ob.nextLine();
        st = st.toLowerCase();
        p = st.length();
        for(i=0;i<p;i++)
        {
            ch = st.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            break;
        }
        st1 = st.substring(i,p);
        st2 = st.substring(0,i);
        System.out.println("Piglatin Form =" +st1+st2+"ay");
    }
    public static void main(String args[])
    {
        Piglatin obj = new Piglatin();
        obj.Piglatin();
    }
}
