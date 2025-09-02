import java.util.*;
class Binary
{
    static String st="";
    static String Convert(int n)
    {
        if(n/2==0)
        return (st+"1");
        else 
        {
            st+= Integer.toString(n%2);
            n = n/2;
            return Convert(n);
        }
    }
    static int t=1;
    static int i=0;
    static String Reverse(String s,int j)
    {
        char c;
        char[] ch = s.toCharArray();
        c = ch[i];
        ch[i] = ch[j];
        ch[j] = c;
        i++;
        j--;
        t++;
        if(t>s.length()/2)
        return String.valueOf(ch);
        else
        return Reverse(String.valueOf(ch),j);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        String s,str;
        System.out.println("Enter a number");
        n = sc.nextInt();
        Binary ob = new Binary();
        s = ob.Convert(n);
        str = ob.Reverse(s,s.length()-1);
        System.out.println("Decimal to Binary ="+str);
    }
}
