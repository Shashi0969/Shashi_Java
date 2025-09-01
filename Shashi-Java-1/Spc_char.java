import java.util.*;
class Spc_char
{
    public static void main(String args [])
    {
        Scanner ob = new Scanner(System.in);
        char p;
        System.out.println("Enter a character");
        p = ob.next().charAt(0);
        if(Character.isLetter(p)==true)
        {
            System.out.println(p+" is a letter");
            if(Character.isUpperCase(p)==true)
            System.out.println(p+ " is in Upper case");
            else 
            System.out.println (p+ " is in Lower case");
        }
        else if(Character.isDigit(p)==true)
        System.out.println(p+ " is a Digit");
        else
        System.out.println(p+" is a special character");
    }
}
