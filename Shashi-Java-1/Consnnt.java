import java.util.*;
class Consnnt
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        String st[] = new String[10];
        String s[] = new String[10];
        int p[] = new int[10];
        int i,j=0;
        System.out.println("Enter the Names");
        for(i=0;i<5;i++)
        {
            st[i] = ob.nextLine();
            p[i] = st[i].length();
        }
        for(i=0;i<5;i++)
        {
            if(st[i].charAt(0)!='A'&&st[i].charAt(0)!='E'&&st[i].charAt(0)!='I'&&st[i].charAt(0)!='O'&&st[i].charAt(0)!='U'&&st[i].charAt(p[i]-1)=='a'||st[i].charAt(p[i]-1)=='e'||st[i].charAt(p[i]-1)=='i'||st[i].charAt(p[i]-1)=='o'||st[i].charAt(p[i]-1)=='u'||st[i].charAt(p[i]-1)=='A'&&st[i].charAt(p[i]-1)=='E'||st[i].charAt(p[i]-1)=='I'||st[i].charAt(p[i]-1)=='O'||st[i].charAt(p[i]-1)=='U')
            {
                s[j]=st[i];
                j++;
            }
        }
        System.out.println("Names starting with consonant and ending with vowel are :");
        for(i=0;i<j;i++)
        {
            System.out.println(s[i]);
        }
    }
}
