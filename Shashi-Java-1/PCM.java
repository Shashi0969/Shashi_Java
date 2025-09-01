import java.util.*;
class PCM
{
    public static void main(String PCM[]) throws Exception
    {
        while(true)
        {
            Scanner ob = new Scanner(System.in);
            int p;
            System.out.println("Enter your Choice");
            System.out.println("1.Maths\n2.Physics\n3.Terminate\n4.Clear Screen");
            p = ob.nextInt();
            if(p==1)
            {
                Maths obj = new Maths();
                obj.Maths();
            }
            else if(p==2)
            {
                Physics obj = new Physics();
                obj.Physics();
            }
            else if(p==3)
            {
                System.out.println("\t\tTerminated");
                break;
            }
            else if(p==4)
            {
                System.out.print("\u000C");
            }
            else 
            System.out.println("Wrong Choice");
        }
    }
}
