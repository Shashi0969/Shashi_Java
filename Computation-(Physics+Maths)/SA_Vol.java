import java.util.*;
import java.math.*;
class SA_Vol
{
    void Solid()
    {
        Scanner ob = new Scanner(System.in);
        int n;
        double d,r,h,b;
        double tsa,csa,vol;
        System.out.println("Enter your choice");
        System.out.println("1. Cylinder");
        System.out.println("2. Cone");
        System.out.println("3. Sphere");
        System.out.println("4. Hemisphere");
        System.out.println("5. Cube");
        System.out.println("6. Cuboid");
        n = ob.nextInt();
        switch(n)
        {
            case 1:
            {
                System.out.println("Enter the height");
                h = ob.nextInt();
                System.out.println("Enter the diameter");
                d = ob.nextDouble();
                r = d/2;
                tsa = 2*3.14*r*(h+r);
                csa = 2*3.14*r*h;
                vol = 3.14*r*r*h;
                System.out.println("TSA =" +tsa);
                System.out.println("CSA =" +csa);
                System.out.println("Volume =" +vol);
            }
            break;
            case 2:
            {
                System.out.println("Enter the length(Slant height)");
                h = ob.nextDouble();
                System.out.println("Enter the diameter");
                d = ob.nextDouble();
                r = d/2;
                tsa = 3.14*r*(h+r);
                csa = 3.14*r*h;
                vol = 1/3*3.14*r*r*r;
                System.out.println("TSA =" +tsa);
                System.out.println("CSA =" +csa);
                System.out.println("Volume =" +vol);
            }
            break ;
            case 3:
            {
                System.out.println("Enter the diameter");
                d = ob.nextDouble();
                r = d/2;
                tsa = 4*3.14*r*r;
                vol = 4/3*r*r*r*3.14;
                csa = tsa;
                System.out.println("TSA =" +tsa);
                System.out.println("CSA =" +csa);
                System.out.println("Volume =" +vol);
            }
            break;
            case 4:
            {
                System.out.println("Enter the diameter");
                d = ob.nextDouble();
                r = d/2;
                tsa = 2*3.14*r*r;
                csa = 3*3.14*r*r;
                vol = 2/3*3.14*r*r*r;
                System.out.println("TSA =" +tsa);
                System.out.println("CSA =" +csa);
                System.out.println("Volume =" +vol);
            }
            break;
            case 5:
            {
                System.out.println("Enter the length of side");
                r = ob.nextDouble();
                tsa = 6*r*r;
                csa = 4*r*r;
                vol = r*r*r;
                d = Math.sqrt(3)*r;
                System.out.println("TSA =" +tsa);
                System.out.println("LSA =" +csa);
                System.out.println("Volume =" +vol);
                System.out.println("Diagonal =" +d);
            }
            break;
            case 6:
            {
                System.out.println("Enter the length,breadth and height");
                r = ob.nextDouble();
                b = ob.nextDouble();
                h = ob.nextDouble();
                tsa = 2*(r*b+b*h+h*r);
                csa = 2*(r+b)*h;
                vol = r*b*h;
                d = Math.sqrt(r*r+b*b+h*h);
                System.out.println("TSA ="+tsa);
                System.out.println("LSA =" +csa);
                System.out.println("Volume =" +vol);
                System.out.println("Diagonal =" +d);
            }
            break;
            default:
            System.out.println("Wrong Choice");    
        }
    }
    public static void main(String args[])
    {
        SA_Vol obj = new SA_Vol();
        obj.Solid();
    }
}
