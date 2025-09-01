import java.io.*;
import java.lang.*;
class Quad
{
    void Quadrilateral() throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(read);
        double a,b,c,d,h,p,ars,arr,arp,arrs,art,ds,dr;
        System.out.println("Enter the four sides and height of Quadrilaterals");
        a = Double.parseDouble(br.readLine());
        b = Double.parseDouble(br.readLine());
        c = Double.parseDouble(br.readLine());
        d = Double.parseDouble(br.readLine());
        h = Double.parseDouble(br.readLine());
        p = a+b+c+d;
        ars = a*a;
        arr = a*c;
        arp = a*h;
        arrs = a*h;
        art = 0.5*(b+d)*h;
        ds = Math.sqrt(2)*a;
        dr = Math.sqrt(a*a+b*b);
        System.out.println("Perimeter =" +p);
        if((a+b+c>d)&&(b+c+d>a)&&(c+d+a>b)&&(d+a+b>c))
        {
            System.out.println("Quadrilateral is possible");
            if((a==b)&&(b==c)&&(c==d)&&(d==a)&&(h==b))
            System.out.println("Square");
            if((a==b)&&(b==c)&&(c==d)&&(d==a)&&(h==b))
            System.out.println("Area =" +ars);
            if((a==b)&&(b==c)&&(c==d)&&(d==a)&&(h==b))
            System.out.println("Diagonal =" +ds);
            else if((a==c)&&(b==d)&&(h==b))
            System.out.println("Rectangle");
            if((a==c)&&(b==d)&&(h==b))
            System.out.println("Area =" +arr);
            if((a==c)&&(b==d)&&(h==b))
            System.out.println("Diagonal =" +dr);
            else if((a==c)&&(b==d)&&(h!=d))
            System.out.println("Parallelogram");
            if((a==c)&&(b==d)&&(h!=d))
            System.out.println("Area =" +arp);
            else if((a==b)&&(b==c)&&(c==d)&&(d==a)&&(h!=b))
            System.out.println("Rhombus");
            if((a==b)&&(b==c)&&(c==d)&&(d==a)&&(h!=b))
            System.out.println("Area =" +arrs);
            else if((a!=b)&&(b!=c)&&(c!=d)&&(d!=a)&&((b==d)||(b!=d))&&(h!=b)&&(h!=d))
            System.out.println("Trapezium");
            if((a!=b)&&(b!=c)&&(c!=d)&&(d!=a)&&((b==d)||(b!=d))&&(h!=b)&&(h!=d))
            System.out.println("Area =" +art);
        }
        else
        System.out.println("Quadrilateral is not possible");
    }
    public static void main(String args[]) throws IOException
    {
        Quad obj = new Quad();
        obj.Quadrilateral();
    }
}
