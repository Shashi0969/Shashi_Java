import java.io.*;
class Elctrcity
{
    void Electricity() throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(read);
        double v,i,r,w,q;
        int n;
        System.out.println("Enter your choice");
        System.out.println("1. Resistance");
        System.out.println("2. Potential Difference");
        n = Integer.parseInt(br.readLine());
        switch(n)
        {
            case 1:
            System.out.println("Enter the value of Potential Difference and Current");
            v = Double.parseDouble(br.readLine());
            i = Double.parseDouble(br.readLine());
            r = v/i;
            System.out.println("Resistance =" +r);
            break;
            case 2:
            System.out.println("Enter the value of Work Done and Current");
            w = Double.parseDouble(br.readLine());
            q = Double.parseDouble(br.readLine());
            v = w/q;
            System.out.println("Potential Difference =" +v);
            break;
            default:
            System.out.println("Wrong Choice");
        }
    }
    public static void main(String args[]) throws IOException
    {
        Elctrcity obj = new Elctrcity();
        obj.Electricity();
    }
}
