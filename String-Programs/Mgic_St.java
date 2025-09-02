import java.util.*;
class Mgic_St
{
    void Magic()
    {
        Scanner ob = new Scanner(System.in);
        String st;
        int i,p,j,c=0;
        char ch,ch1;
        System.out.println("Enter the String");
        st = ob.nextLine();
        p = st.length();
        for(i=0;i<p;i++)
        {
            ch = st.charAt(i);
            for(j=0;j<p;j++)
            {
                ch1 = st.charAt(j);
                if((int)ch-(int)ch1==1||(int)ch1-(int)ch==1)
                c++;
            }
        }
        if(c>0)
        System.out.println(st+" is a Magic String");
        else 
        System.out.println(st+" is not a Magic String");
    }
    public static void main(String args[])
    {
        Mgic_St obj = new Mgic_St();
        obj.Magic();
    }
}
