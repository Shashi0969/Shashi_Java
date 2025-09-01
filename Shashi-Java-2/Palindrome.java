import java.util.*;
class Palindrome
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        String st,p;
        System.out.println("Enter the number or String");
        st = ob.nextLine();
        Reverse obj = new Reverse();
        p = obj.Reverse(st,0,st.length()-1);
        if(st.equals(p)==true)
        System.out.println("The number is Palindrome");
        else
        System.out.println("The number is not Palindrome");
    }
}
