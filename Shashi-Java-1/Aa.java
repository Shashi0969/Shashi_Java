import java.util.*;
class Aa
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        String st[] = new String[10];
        int p[] = new int[10];
        int i,j=0;
        String s[] = new String[10];
        System.out.println("Enter the names");
        for(i=0;i<5;i++)
        {
            st[i] = ob.nextLine();
            p[i] = st[i].length();
            if((st[i].charAt(0)=='A'||st[i].charAt(0)=='a')&&(st[i].charAt(p[i]-1)=='a'||st[i].charAt(p[i]-1)=='A'))
            {
                s[j]=st[i];
                j++;
            }
        }
        System.out.println("Names starting and ending with A or a are :");
        for(i=0;i<j;i++)
        {
            System.out.println(s[i]);
        }
    }
}
