import java.util.*;
class Half2
{
    public static void main(String Half2[])
    {
        Scanner ob = new Scanner(System.in);
        String st;
        int i,j,p,k;
        System.out.println("Enter the String");
        st = ob.nextLine();
        p = st.length();
        if(p%2==0)
        {
            k = p/2-1;
            j=k+1;
        }
        else
        {
            k=(p+1)/2-1;
            j=k;
        }
        while(k>=0)
        {
            j++;
            for(i=0;i<=k;i++)
            System.out.print(" ");
            System.out.println(st.substring(k,j));
            k--;
        }
    }
}
