import java.util.*;
class Surname
{
    public static void main(String args[]) throws Exception
    {
        Scanner ob = new Scanner(System.in);
        String name,name2,j;
        int i,st;
        System.out.println("Enter a three words name");
        name = ob.nextLine();
        st = name.indexOf(' ');
        j = name.substring(0,st);
        int k = name.length();
        int p = name.lastIndexOf(' ');
        String m = name.substring(st,p);
        String n = name.substring(p,k);
        name2 = j+n;
        System.out.println("New Name = " +name2);
        System.out.println("Mid Name =" +m);
    }
}
