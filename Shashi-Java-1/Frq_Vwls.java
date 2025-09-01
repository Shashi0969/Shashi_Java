import java.util.*;
class Frq_Vwls extends Frq_Wrd
{
    public static void main(String Frq_Vwls[])
    {
        Scanner ob  = new Scanner(System.in);
        for(int k=1;k>0;k++)
        {
        String st;
        char ch;
        int i,p,v=0,v1=0,v2=0,v3=0,v4=0;
        System.out.println("Enter the String");
        st = ob.nextLine();
        p = st.length();
        for(i=0;i<p;i++)
        {
            ch = st.charAt(i);
            if (ch=='a'||ch=='A')
            v = v+1;
            else if (ch=='e'||ch=='E')
            v1 = v1+1;
            else if (ch=='i'||ch=='I')
            v2 = v2+1;
            else if (ch=='o'||ch=='O')
            v3 = v3+1;
            else if (ch=='u'||ch=='U')
            v4 = v4+1;
        }
        System.out.println("Frequency of 'A' =" +v);
        System.out.println("Frequency of 'E' =" +v1);
        System.out.println("Frequency of 'I' =" +v2);
        System.out.println("Frequency of 'O' =" +v3);
        System.out.println("Frequency of 'U' =" +v4);
        if (st=="0")
        System.exit(0);
    }
}
}
