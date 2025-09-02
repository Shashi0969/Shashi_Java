import java.util.*;
class Vowels_2
{
    public static void main(String Vowels2[])
    {
        Scanner ob = new Scanner(System.in);
        for(int m=1;m>0;m++)
        {
        String str;
        int a,st,v=0;
        char ch,k;
        System.out.println("Enter a String");
        str = ob.nextLine();
        st = str.length();
        k = str.charAt(0);
        for(a=0;a<st;a++)
        {
            ch = str.charAt(a);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            continue;
            v = v+1;
        }
        System.out.println("No. of letters excluding vowels =" +v);
        if(Character.isWhitespace(k)==true)
        System.exit(0);
    }
    }
}
