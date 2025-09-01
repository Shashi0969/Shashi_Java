import java.util.*;
class Physics
{
    void Physics()throws Exception
    {
        while(true)
        {
            Scanner ob = new Scanner(System.in);
            int p;
            System.out.println("Enter your choice");
            System.out.println("1.Electricity\n2.Force\n3.Equation Of Motion\n4.Temperature\n5.Terminate\n6.Clear Screen");
            p = ob.nextInt();
            if(p==1)
            {
                Elctrcity obj = new Elctrcity();
                obj.Electricity();
            }
            else if(p==2)
            {
                Force obj = new Force();
                obj.Force();
            }
            else if(p==3)
            {
                Eq_Mtion obj = new Eq_Mtion();
                obj.Eq_Motion();
            }
            else if(p==4)
            {
                Tmprtre obj = new Tmprtre();
                obj.Temperature();
            }
            else if(p==6)
            {
                System.out.print("\u000C");
            }
            else if(p==5)
            {
                System.out.println("\t\tTerminated");
                break;
            }
            else
            System.out.println("Wrong Choice");
        }
    }
    public static void main(String Physics[]) throws Exception
    {
        Physics obj = new Physics();
        obj.Physics();
    }
}
