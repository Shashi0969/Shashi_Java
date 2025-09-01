import java.io.*;
import java.lang.*;
class Cubicoid
{
    void Cubicoid() throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(read);
        double l,b,h,tsa,tsac,v,lsa,lsac,d,dc;
        System.out.println("Enter the Sides of the Solid");
        l = Double.parseDouble(br.readLine());
        b = Double.parseDouble(br.readLine());
        h = Double.parseDouble(br.readLine());
        v = l*b*h;
        tsac = 2*(l*b+b*h+h*l);
        tsa = 6*l*l;
        lsa = 4*l*l;
        lsac = 2*(l+b)*h;
        d = Math.sqrt(3)*l;
        dc = Math.sqrt(l*l+b*b+h*h);
        if(l+b>h&&b+h>l&&h+l>b)
        {
            if(l==b&&b==h&&h==l)
            {
                System.out.println("Cube");
                System.out.println("Volume =" +v);
                System.out.println("Total Surface Area =" +tsa);
                System.out.println("Lateral Surface Area =" +lsa);
                System.out.println("Diagonal =" +d);
            }
            else if(l!=b&&b!=h&&h!=l)
            {
                System.out.println("Cuboid");
                System.out.println("Volume =" +v);
                System.out.println("Total Surface Area =" +tsac);
                System.out.println("Lateral Surfece Area =" +lsac);
                System.out.println("Diagonal =" +dc);
            }
        }
        else
        System.out.println("Solid is not Possible");
    }
    public static void main(String args[]) throws IOException
    {
        Cubicoid obj = new Cubicoid();
        obj.Cubicoid();
    }
}
