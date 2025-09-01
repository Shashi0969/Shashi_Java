import java.util.*;
class Function
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the function");
        String y = ob.nextLine();
        System.out.println("Enter the value of x");
        String x = ob.nextLine();
        Derivative obj = new Derivative();
        System.out.println("Function = "+obj.f(x,y));
    }
}
