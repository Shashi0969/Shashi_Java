import java.io.*;
class Intrchnge
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(read);
        double a=0,b=0,c=0;
        int n;
        System.out.println("Enter your choice");
        System.out.println("1. With two variables");
        System.out.println("2. With three variables");
        n = Integer.parseInt(br.readLine());
        if(n==1||n==2)
        {
            System.out.println("Enter the two numbers to be Interchanged");
            a = Double.parseDouble(br.readLine());
            b = Double.parseDouble(br.readLine());
        }
        switch(n)
        {
            case 1:
            a = a+b;
            b = a-b;
            a = a-b;
            System.out.println("Value of a =" +a);
            System.out.println("Value of b =" +b);
            break;
            case 2:
            c = a;
            a = b;
            b = c;
            System.out.println("Value of a =" +a);
            System.out.println("Value of b =" +b);
            break;
            default:
            {
                System.out.println("Wrong Choice");
                System.exit(0);
            }
        }
    }
}
