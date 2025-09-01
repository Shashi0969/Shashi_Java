import java.util.*;
import java.io.*;
class Plndrm_st
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        String st,s3,s="",s2="",st2="";
        int i,j,p,k=0;
        char ch,c=' ';
        System.out.println("Enter a String");
        /*while(true)
        {
            st = ob.next();
            Reverse obj = new Reverse();
            s = obj.Reverse2(st);
            if(s.compareTo(st)==0&&s!=".")
            {
                System.out.println(s);
                k++;
            }
            if(st.compareTo(" ")==0)
            break;
        }*/
        st = ob.nextLine();
        s3 = st+" ";
        p = s3.length();
        for(i=0;i<p;i++)
        {
            ch = s3.charAt(i);
            if(ch!=' ')
            s = s+ch;
            if(ch==' ')
            {
                st2 = s;
                Reverse obj = new Reverse();
                s2 = obj.Reverse2(st2);
                if(s2.equalsIgnoreCase(st2)==true)
                {
                    System.out.println(s2);
                    k++;
                }
                s = "";
            }
        }
        PrintWriter obj1 = new PrintWriter(System.out,true);
        obj1.println(k);
        if(k>0)
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}
