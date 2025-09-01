import java.util.*;
class St_Arrng
{
    void Arrange()
    {
        Scanner ob = new Scanner(System.in);
        int i,p,j;
        char ch;
        String st,st1="";
        System.out.println("Enter the String");
        st = ob.nextLine();
        p = st.length();
        for(j=65;j<=90;j++)
        {
            st = st.toUpperCase();
            for(i=0;i<p;i++)
            {
                ch = st.charAt(i);
                if(ch==(char)j)
                st1 = st1+ch;
            }
        }
        System.out.println("Arranged = "+st1);
    }
    public static void main(String args[])
    {
        St_Arrng obj = new St_Arrng();
        obj.Arrange();
    }
}
