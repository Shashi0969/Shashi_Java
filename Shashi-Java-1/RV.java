import java.util.*;
class RV
{
    void Relative()
    {
        Scanner ob = new Scanner (System.in);
        int n;
        double v1,v2,d1,d2,rv,rd,t;
        System.out.println("Enter one of the following directions of the two trains");
        System.out.println("1. Same direction");
        System.out.println("2. Opposite direction");
        n = ob.nextInt();
        switch(n)
        {
            case 1:
            System.out.println("Enter the velocities of the two trains");
            v1 = ob.nextDouble();
            v2 = ob.nextDouble();
            System.out.println("Enter the length of the two trains");
            d1 = ob.nextDouble();
            d2 = ob.nextDouble();
            rv = v1-v2;
            rd = d1-d2;
            t = rd/rv;
            System.out.println("Relative velocity =" +rv);
            System.out.println("Time Taken =" +t);
            break ;
            case 2:
            System.out.println("Enter the velocities of the two trains");
            v1 = ob.nextDouble();
            v2 = ob.nextDouble();
            System.out.println("Enter the lengh of the two trains");
            d1 = ob.nextDouble();
            d2 = ob.nextDouble();
            rv = v1+v2;
            rd = d1+d2;
            t = rd/rv;
            System.out.println("Relative velocity =" +rv);
            System.out.println("Time Taken =" +t);
            break ;
            default :
            System.out.println("Wrong Choice");
        }
    }
    public static void main(String args[])
    {
        RV obj = new RV();
        obj.Relative();
    }
}
