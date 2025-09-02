import java.util.*;
class Frq_Lttr
{
    public static void main(String Frq_Lttr[])
    {
        Scanner ob = new Scanner(System.in);
        String st;
        char ch,c=' ';
        int p,i,f=0;
        System.out.println("Enter the String");
        st = ob.nextLine();
        System.out.println("Enter the letter whose frequency is to be checked");
        ch = ob.next().charAt(0);
        p = st.length();
        for(i=0;i<p;i++)
        {
            c = st.charAt(i);
            if(c==ch)
            f = f+1;
        }
        System.out.println("Frequency of" +ch+ "in the sentence =" +f);
}
}
