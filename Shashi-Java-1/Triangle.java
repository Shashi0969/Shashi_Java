import java.util.*;
import java.lang.*;
class Triangle
{
    void Triangle()
    {
        Scanner ob = new Scanner(System.in);
        for(int k=1;k>0;k++)
            {
            int n;
            double a,b,c,sa,sb,sc,sp,ari,ar,ars,ar1,ar2,p,ar3,ar4,h,peri,area,s;
            System.out.println("Enter your choice");
            System.out.println("1. Possibility and Type of Triangle and its area and perimeter");
            System.out.println("2. Area of Right Angled Triangle");
            System.out.println("3. Possibility and Type of Triangle");
            System.out.println("4. Possibility and Type of Triangle by angles");
            System.out.println("5. Equable or Non Equable");
            n = ob.nextInt();
            switch(n)
            {
                case 1:
                System.out.println("Enter the three sides of a Triangle");
                a = ob.nextDouble();
                b = ob.nextDouble();
                c = ob.nextDouble();
                sa = a*a;
                sb = b*b;
                sc = c*c;
                p = a+b+c;
                sp = p/2;
                ari = 0.25*b*(Math.sqrt(4*a*a-b*b));
                ar = sp*(sp-a)*(sp-b)*(sp-c);
                ars = Math.sqrt(ar);
                ar1 = 0.5*(a*b);
                ar2 = 0.5*(b*c);
                ar3 = 0.5*(a*c);
                ar4 = (Math.sqrt(3)*a*a)/4;
                if((a+b>c)&&(b+c>a)&&(c+a>b))
                {
                System.out.println("The Triangle is Possible");
                if(((sa+sb)==sc)||((sb+sc)==sa)||((sa+sc)==sb))
                System.out.println("Right angled Triangle");
                if((sa+sb)==sc)
                System.out.println("Area =" +ar1);
                else if((sb+sc)==sa)
                System.out.println("Area =" +ar2);
                else if((sa+sc)==sb)
                System.out.println("Area ="+ar3);
                else if((a==b)&&(b==c)&&(c==a))
                System.out.println("Equilateral Triangle");
                if((a==b)&&(b==c)&&(c==a))
                System.out.println("Area =" +ar4);
                else if((a==b)||(b==c)||(c==a))
                System.out.println("Isosceles Triangle");
                if((a==b)||(b==c)||(c==a))
                System.out.println("Area =" +ari);
                else if((a!=b)&&(b!=c)&&(c!=a))
                System.out.println("Scalene Triangle");
                if((a!=b)||(b!=c)||(c!=a))
                System.out.println("Area =" +ars);
                }
                if((a+b>c)&&(b+c>a)&&(c+a>b))
                System.out.println("Perimeter =" +p);
                else
                System.out.println("Triangle is not Possible");
                break;
                case 2:
                System.out.println("Enter the perpendicular,base and hypotenuse of the right angled triangle");
                p = ob.nextDouble();
                b = ob.nextDouble();
                h = ob.nextDouble();
                peri = p+b+h;
                area = 1*b*p/2;
                System.out.println("Perimeter =" +peri);
                System.out.println("Area =" +area);
                break;
                case 3:
                a = ob.nextDouble();
                b = ob.nextDouble();
                c = ob.nextDouble();
                if((a+b>c)&&(b+c>a)&&(c+a>b))
                {
                System.out.println("Triangle is Possible");
                if((a==b)&&(b==c)&&(c==a))
                System.out.println("Equilateral Triangle");
                else if((a==b)||(b==c)||(c==a))
                System.out.println("Iscosceles Triangle");
                else if((a!=b)||(b!=c)||(c!=a))
                System.out.println("Scalene Triangle");
                }
                else
                System.out.println("Triangle is not Possible");
                break;
                case 4:
                System.out.println("Enter the three angles of the triangle");
                a = ob.nextDouble();
                b = ob.nextDouble();
                c = ob.nextDouble();
                if ((a+b+c)==180)
                {
                System.out.println("Triangle is possible");
                if ((a>=90)&&(a<=120)||(b>=90)&&(b<=120)||(c>=90)&&(c<=120))
                System.out.println("Obtuse Angled Triangle");
                else if ((a>=60)&&(a<=90)||(b>=60)&&(b<=90)||(c>=60)&&(c<=90))
                System.out.println("Acute Angled Triangle");
                else if ((a==90)||(b==90)||(c==90))
                System.out.println("Right Angled Triangle");
                }
                else 
                System.out.println("Triangle is not Possible");
                break;
                case 5:
                System.out.println("Enter the three Sides of Triangle");
                a = ob.nextDouble();
                b = ob.nextDouble();
                c = ob.nextDouble();
                p = a+b+c;
                s = p/2;
                ar = Math.sqrt(s*(s-a)*(s-b)*(s-c));
                System.out.println("Perimeter =" +p);
                System.out.println("Area =" +ar);
                if (ar==p)
                System.out.println("Equable Triangle");
                else
                System.out.println("Non Equable Triangle");
                break;
                default:
                System.out.println("Wrong Choice");
            }
            if(n==0)
            break;
        }
    }
    public static void main(String args[]) throws Exception
    {
        Triangle obj = new Triangle();
        obj.Triangle();
    }
}

