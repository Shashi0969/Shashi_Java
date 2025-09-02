import java.util.*;
class Calcltor
{
    void Calculator() throws Exception
    {
        Scanner ob = new Scanner(System.in);
        double a,b;
        double c,d,e,sq;
        int k;
        int n;
        for(int m=1;m>0;m++)
        {
            System.out.println("Enter one of the following");
            for(k=1;k<99999999;k++);
            System.out.println("1. Sum");
            for(k=1;k<99999999;k++);
            System.out.println("2. Difference");
            for(k=1;k<99999999;k++);
            System.out.println("3. Product");
            for(k=1;k<99999999;k++);
            System.out.println("4. Quotient");
            for(k=1;k<99999999;k++);
            System.out.println("5. Remainder");
            for(k=1;k<99999999;k++);
            System.out.println("6. SDPQR");
            for(k=1;k<99999999;k++);
            System.out.println("7. Square Root");
            for(k=1;k<99999999;k++);
            System.out.println("8. Cube Root");
            for(k=1;k<99999999;k++);
            System.out.println("9. Square");
            for(k=1;k<99999999;k++);
            System.out.println("10. Percentage");
            for(k=1;k<99999999;k++);
            System.out.println("11. SCSP");
            for(k=1;k<99999999;k++);
            System.out.println("12. Base from power");
            for(k=1;k<99999999;k++);
            System.out.println("13. Terminate");
            for(k=1;k<99999999;k++);
            System.out.println("14. Clear Screen");
            for(k=1;k<99999999;k++);
            n = ob.nextInt();
            for(k=1;k<99999999;k++);
            System.out.print("Enter the number");
            switch(n)
            {
                case 1:
                System.out.println("s");
                a = ob.nextDouble();
                b = ob.nextDouble();
                Thread.sleep(100);
                System.out.println("Sum ="+(a+b));
                break;
                case 2:
                System.out.println("s");
                a = ob.nextDouble();
                b = ob.nextDouble();
                Thread.sleep(100);
                System.out.println("Difference ="+(a-b));
                break;
                case 3:
                System.out.println("s");
                a = ob.nextDouble();
                b = ob.nextDouble();
                Thread.sleep(100);
                System.out.println("Product =" +a*b);
                break;
                case 4:
                System.out.println("s");
                a = ob.nextDouble();
                b = ob.nextDouble();
                Thread.sleep(100);
                System.out.printf("Quotient = %.3f",a/b);
                System.out.println();
                break;
                case 5:
                System.out.println("s");
                a = ob.nextDouble();
                b = ob.nextDouble();
                Thread.sleep(100);
                System.out.println("Remainder ="+a%b);
                break;
                case 6:
                System.out.println("s");
                a = ob.nextDouble();
                b = ob.nextDouble();
                Thread.sleep(100);
                System.out.println("Sum ="+(a+b));
                Thread.sleep(100);
                System.out.println("Difference ="+(a-b));
                Thread.sleep(100);
                System.out.println("Product =" +a*b);
                Thread.sleep(100);
                System.out.printf("Quotient = %.3f",a/b);
                System.out.println();
                Thread.sleep(100);
                System.out.println("Remainder ="+a%b);
                break;
                case 7:
                System.out.println();
                c = ob.nextDouble();
                d = Math.sqrt(c);
                Thread.sleep(100);
                System.out.printf("Square root = %.3f",d);
                System.out.println();
                break;
                case 8:
                System.out.println();
                c = ob.nextDouble();
                e = Math.cbrt(c);
                Thread.sleep(100);
                System.out.printf("Cube root =%.3f" ,e);
                System.out.println();
                break;
                case 9:
                System.out.println();
                c = ob.nextDouble();
                sq = c*c;
                Thread.sleep(100);
                System.out.println("Square =" +sq);
                break;
                case 10:
                System.out.println();
                c = ob.nextDouble();
                Thread.sleep(100);
                System.out.println("Percentage =" +c/100);
                break;
                case 11:
                System.out.println();
                c = ob.nextDouble();
                d = Math.sqrt(c);
                e = Math.cbrt(c);
                sq = c*c;
                Thread.sleep(100);
                System.out.printf("Square root = %.3f",d);
                System.out.println();
                Thread.sleep(100);
                System.out.printf("Cube root = %.3f",e);
                System.out.println();
                Thread.sleep(100);
                System.out.println("Square =" +sq);
                Thread.sleep(100);
                System.out.println("Percentage =" +c/100);
                break;
                case 12:
                System.out.println();
                c = ob.nextDouble();
                System.out.println("Enter the power");
                double cp = ob.nextDouble();
                Thread.sleep(100);
                System.out.println("Base (Integer value) = " +(long)Math.pow(c,cp));
                Thread.sleep(100);
                System.out.println("Base (Decimal value) = " +Math.pow(c,cp));
                break;
                default:
                System.out.println();
                Thread.sleep(100);
                System.out.println("Wrong choice");
            }
            if(n==13)
            {
                System.out.print("\t\tTerminated");
                break;
            }
            else if(n==14)
            {
                System.out.print("\u000C");
            }
        }
    }
    public static void main(String args[]) throws Exception
    {
        Scanner ob = new Scanner(System.in);
        Calcltor obj = new Calcltor();
        obj.Calculator();
    }
}
