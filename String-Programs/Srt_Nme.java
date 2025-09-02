import java.util.*;
class Srt_Nme
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int i,j,p;
        String s,st="";
        char ch,ch2=' ',ch3;
        System.out.println("Enter the String");
        s = ob.nextLine();
        ch3 = s.charAt(0);
        p = s.length();
        for(i=0;i<p;i++)
        {
            ch = s.charAt(i);
            if(ch==' ')
            {
                ch2 = s.charAt(i+1);
                st = st+"."+ch2;
            }
        }
        System.out.println("New String = "+ch3+st);
    }
}
