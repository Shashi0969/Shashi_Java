import java.util.*;
class Buzz
{
    void Buzz()
    {
        int a,b;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a no.");
        a = ob.nextInt();
        if(a%10==7||a%7==0)
        System.out.println(a+" is a Buzz no.");
        else 
        System.out.println(a+" is not a Buzz no.");
    }
    public static void main(String args[])
    {
        int p;
        Buzz obj = new Buzz();
        obj.Buzz();
    }
}
