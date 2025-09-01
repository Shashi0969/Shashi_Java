import java.util.*;
class Half3
{
    public static void main(String Half3[])
    {
        Scanner ob = new Scanner(System.in);
        String st,st1="";
        int i,p,j,k=0,t;
        char ch;
        System.out.println("Enter the String");
        st = ob.nextLine();
        p = st.length();
        t = p-1;
        j=1;
        if(p%2==0)
        {
            k=p/2;
            while(k>0)
            {
                k--;
                for(i=0;i<=k;i++)
                System.out.print(" ");
                System.out.println(st1=st.substring(0,j));
                for(i=0;i<=k;i++)
                System.out.print(" ");
                System.out.println(st1+=st.substring(t,p));
                j++;
                t--;
            }
        }
        else
        {
            k=(p+1)/2;
            while(k>0)
            {
                k--;
                for(i=0;i<=k;i++)
                System.out.print(" ");
                System.out.println(st1=st.substring(0,j));
                for(i=0;i<=k;i++)
                System.out.print(" ");
                System.out.println(st1+=st.substring(t,p));
                j++;
                if(t>(p+1)/2)
                t--;
            }
        }
    }
}
