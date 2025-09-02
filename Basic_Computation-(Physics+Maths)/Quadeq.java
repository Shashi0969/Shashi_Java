import java.io.*;
import java.lang.*;
class Quadeq
{
    void Quadratic() throws Exception
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(read);
        double a,b,c,q,q1;
        System.out.println("Enter the three values");
        System.out.print("a = ");
        a = Double.parseDouble(br.readLine());
        System.out.print("b = ");
        b = Double.parseDouble(br.readLine());
        System.out.print("c = ");
        c = Double.parseDouble(br.readLine());
        q = (-b+Math.sqrt(b*b-4*a*c))/2*a;
        q1 = (-b-Math.sqrt(b*b-4*a*c))/2*a;
        System.out.printf("Positive Quadratic Equation = %.3f",q);
        System.out.println();
        System.out.printf("Negative Quadratic Equation = %.3f",q1);
        System.out.println();
    }
    public static void main(String args[]) throws Exception
    {
        Quadeq obj = new Quadeq();
        obj.Quadratic();
    }
}
