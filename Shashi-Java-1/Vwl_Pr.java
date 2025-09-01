import java.util.*;
class Vwl_Pr
{
    public static void main(String Vwl_Pr[])
    {
        Scanner ob = new Scanner(System.in);
        String st,s,s2="";
        int p,i,m=0,v=0;
        char ch,ch2=' ';
        System.out.println("Enter a String");
        st = ob.nextLine();
        p = st.length();
        s = st.toUpperCase();//To change the String in uppercase
        System.out.println("Pairs of Vowels :");
        for(i=0;i<p;i++)
        {
            ch = s.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')//To find Vowels
            {
                ch2=ch;
                s2 = s2+ch2;
                m++;//To find remaining vowels out of the pair
                if(m==2)//To find pairs
                {
                    System.out.println(s2);
                    s2="";
                    m=0;
                    v++;//To count the pairs
                }
            }
        }
        if(m>0||v>0)
        {
            if(v>0)
            System.out.println("No. of vowel pairs =" +v);
            else 
            System.out.println("Pairs of vowels does not exist");
            if(v>0)
            System.out.println("No. of remaining vowels out of pairs =" +m);
            else 
            System.out.println("No remaining vowels out of the pairs");
        }
        else 
        System.out.println("Vowels Does not exist");
    }
}
