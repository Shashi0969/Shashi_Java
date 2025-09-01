import java.util.*;
import java.io.*;
class Class
{
    public static void main(String args[]) throws IOException
    {
        Scanner sc = new Scanner(new File("Class.dat"));
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the first name");
        if(sc.next().equalsIgnoreCase(ob.next())==true)
        {
            System.out.println("Enter the Surname");
            if(sc.next().equalsIgnoreCase(ob.next())==true)
            {
                System.out.println("Physics :" +sc.next());
                System.out.println("Chemistry :" +sc.next());
                System.out.println("Biology :" +sc.next());
            }
        }
        else
        System.out.println("No such Record is present");
        ob.close();
        sc.close();
    }
}
