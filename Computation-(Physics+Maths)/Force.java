import java.io.*;
class Force
{
    void Force() throws Exception
    {
        InputStreamReader read =  new  InputStreamReader(System.in);
        BufferedReader br =  new  BufferedReader(read);
        int n;
        double d,m,v,p,f,t;
        System.out.println("Enter your choice");
        System.out.println("1. Force \n2. Momentum\n3. Torque");
        n = Integer.parseInt(br.readLine());
        switch(n)
        {
            case 1:
            System.out.println("Enter the Mass and Velocity of the Object");
            m = Double.parseDouble(br.readLine());
            v = Double.parseDouble(br.readLine());
            f = m*v;
            System.out.println("Force =" + f);
            break;
            case 2:
            System.out.println("Enter the Mass and Velocity of an Object");
            m = Double.parseDouble(br.readLine());
            v = Double.parseDouble(br.readLine());
            p = m*v;
            System.out.println("Momentum =" +p);
            break;
            case 3:
            System.out.println("Enter the Force applied and Distance between the application of force and the object");
            f = Double.parseDouble(br.readLine());
            d = Double.parseDouble(br.readLine());
            t = f*d;
            System.out.println("Torque =" +t);
            break;
            default:
            System.out.println("Wrong Choice");
        }
    }
    public static void main(String Force[]) throws Exception
    {
        Force obj = new Force();
        obj.Force();
    }
}
