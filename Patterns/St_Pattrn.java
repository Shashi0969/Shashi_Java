import java.util.*;
class St_Pattrn
{
    public static void main(String Name_Diamond[])
    {
        Scanner ob = new Scanner(System.in);
        String st;
        char ch=' ';
        int i,j,p,k,m,l;
        System.out.println("Enter a String");
        st = ob.nextLine();
        System.out.println("Pattern");
        p = st.length();
        m = p;
        for(i=0;i<=p;i++)
        {
            for(k=m;k>=1;k--)
            System.out.print(" ");
            for(j=0;j<i;j++)
            {
                ch = st.charAt(j);
                System.out.print(ch+" ");
            }
            System.out.println();
            m--;
        }
        m = 1;
        for(i=p;i>=1;i--)
        {
            for(k=1;k<=m;k++)
            System.out.print(" ");
            for(j=i-1,l=0;l<i-1&j>=0;j--,l++)
            {
                ch = st.charAt(l);
                System.out.print(ch+" ");
            }
            System.out.println();
            m++;
        }
    }
}