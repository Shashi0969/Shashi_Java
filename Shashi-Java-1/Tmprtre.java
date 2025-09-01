import java.util.*;
class Tmprtre
{
    void Temperature()
    {
        Scanner ob = new Scanner(System.in);
        int n;
        double a,b;
        System.out.println("Enter the temperature to change from:-");
        System.out.println("1. Celsius to Fahrenhrit");
        System.out.println("2. Fahrenheit to Celsius");
        n = ob.nextInt();
        a = ob.nextDouble();
        switch(n)
        {
            case 1:
            b = 1.8*a+32;
            System.out.println("Temperature =" +b+"\"F");
            break;
            case 2:
            b = 5*(a-32)/9;
            System.out.println("Temperature =" +b+"\"C");
            break;
            default:
            System.out.println("Wrong Choice");
        }
    }
    public static void main(String args[])
    {
        Tmprtre obj = new Tmprtre();
        obj.Temperature();
    }
}
