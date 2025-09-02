import java.util.*;
class Digits_No
{
    public static void main(String digits[])
    {
        Scanner ob = new Scanner(System.in);
        String str;
        int n;
        System.out.println("Enter the number");
        str = ob.nextLine();
        n = str.length();
        System.out.println("Number of Digits =" +n);
    }
}
