import java.util.*;
class Vowels extends Vowels_2
{
    public static void main(String Vowels[])
    {
        Scanner ob = new Scanner(System.in);
        String str,s=" ";
        int a,st;
        char ch;
        System.out.println("Enter a String");
        str = ob.nextLine();
        st = str.length();
        for(a=0;a<st;a++)
        {        
            ch = str.charAt(a);
            if(ch!='a'||ch!='e'||ch!='i'||ch!='o'||ch!='u')
            s = s+str.charAt(a);
        }
        System.out.println("New name =" +s);
    }
}
