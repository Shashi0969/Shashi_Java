import java.util.*;
class Maths
{
    void Maths() throws Exception
    {
        while(true)
        {
            Scanner ob = new Scanner(System.in);
            int p;
            System.out.println("Enter your choice :");
            System.out.println("1.Calculator\n2.Triangle\n3.Quadrilateral\n4.Solid\n5.Quadratic equation\n6.Area of 2D objects\n7.Factors\n8.Factorial\n9.Even/Odd\n10.Relative Velocity\n11.Prime\n12.Square Root\n13.AP\n14.GP\n15.Terminate\n16.Clear Screen");
            p = ob.nextInt();
            if(p==1)
            {
                Calcltor obj = new Calcltor();
                obj.Calculator();
            }
            else if(p==2)
            {
                Triangle obj = new Triangle();
                obj.Triangle();
            }
            else if(p==3)
            {
                Quad obj = new Quad();
                obj.Quadrilateral();
            }
            else if(p==5)
            {
                Quadeq obj = new Quadeq();
                obj.Quadratic();
            }
            else if(p==4)
            {
                SA_Vol obj = new SA_Vol();
                obj.Solid();
            }
            else if(p==6)
            {
                Area obj = new Area();
                obj.Area();
            }
            else if(p==7)
            {
                Factors obj = new Factors();
                obj.Factors();
            }
            else if(p==8)
            {
                Factorial obj = new Factorial();
                obj.Factorial();
            }
            else if(p==10)
            {
                RV obj = new RV();
                obj.Relative();
            }
            else if(p==9)
            {
                Evn_Odd obj = new Evn_Odd();
                obj.Even_Odd();
            }
            else if(p==11)
            {
                Prime obj = new Prime();
                obj.Prime();
            }
            else if(p==12)
            {
                Sqr_Root obj = new Sqr_Root();
                obj.Square_Root();
            }
            else if(p==13)
            {
                AP obj = new AP();
                obj.AP();
            }
            else if(p==14)
            {
                GP obj = new GP();
                obj.GP();
            }
            else if(p==16)
            {
                System.out.print("\u000C");
            }
            else 
            System.out.println("Wrong Choice");
            if(p==15)
            {
                System.out.println("\t\tTerminated");
                break;
            }
        }
    }
    public static void main(String Maths[]) throws Exception
    {
        Maths obj = new Maths();
        obj.Maths();
    }
}
