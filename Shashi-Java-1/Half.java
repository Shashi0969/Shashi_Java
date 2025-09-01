import java.util.*;
class Half extends Half2
{
    public static void main(String Half[])
    {
        Scanner ob = new Scanner(System.in);
        int i,p,j=0,t,k=0;
        String st;
        System.out.println("Enter the String");
        st = ob.nextLine();
        p = st.length();
        if(p%2==0)
        {
            t=p/2;
            k=t;
            while(k>0)
            {
                k--;
                for(i=0;i<=k;i++)
                System.out.print(" ");
                System.out.println(st.substring(k,t));
                t++;
                for(i=0;i<=k;i++)
                System.out.print(" ");
                System.out.println(st.substring(k,t));
            }
        }
        else
        {
            t=(p+1)/2;
            k=t;
            while(k>0)
            {
                k--;
                for(i=0;i<=k;i++)
                System.out.print(" ");
                System.out.println(st.substring(k,t));
                if(t<p)
                {
                    for(i=0;i<=k;i++)
                    System.out.print(" ");
                    t++;
                    System.out.println(st.substring(k,t));
                }
            }
        }
    }
}
