import java.io.*;
class Eq_Mtion
{
    void Eq_Motion() throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(read);
        double u,a,t,v,S;
        int n;
        System.out.println("Enter your choice");
        System.out.println("1. Final Velocity in terms of u,a and t");
        System.out.println("2. Distance Travelled");
        System.out.println("3. Final Velocity in terms of u,a and S");
        n = Integer.parseInt(br.readLine());
        switch(n)
        {
            case 1:
            System.out.println("To Find the Final Velocity");
            System.out.println("Enter the Initial velocity,Acceleration and Time Taken");
            u = Double.parseDouble(br.readLine());
            a = Double.parseDouble(br.readLine());
            t = Double.parseDouble(br.readLine());
            v = u+a*t;
            System.out.println("Final Velocity =" +v);
            break;
            case 2:
            System.out.println("To Find the Distance Travelled");
            System.out.println("Enter the Initial Velocity,Time Taken and Acceleration");
            u = Double.parseDouble(br.readLine());
            t = Double.parseDouble(br.readLine());
            a = Double.parseDouble(br.readLine());
            S = u*t+0.5*a*t*t;
            System.out.println("Distance Travelled =" +S);
            break;
            case 3:
            System.out.println("To Find the Final Velocity");
            System.out.println("Enter the Initial velocity,Acceleration and Distance Taken");
            u = Double.parseDouble(br.readLine());
            a = Double.parseDouble(br.readLine());
            S = Double.parseDouble(br.readLine());
            v = Math.sqrt(u*u+2*a*S);
            System.out.println("Final Velocity =" +v);
        }
    }
    public static void main(String args[]) throws IOException
    {
        Eq_Mtion obj = new Eq_Mtion();
        obj.Eq_Motion();
    }
}
