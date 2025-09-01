import java.util.*;
import java.io.*;
class Class1
{
    public static void main(String args[]) throws IOException
    {
        FileWriter fr = new FileWriter("Class.dat");
        BufferedWriter br = new BufferedWriter(fr);
        PrintWriter pr = new PrintWriter(br);
        Scanner ob = new Scanner(System.in);
        String name1,name2;
        String ph,ch,bio;
        int i;
        for(i=1;i<=5;i++)
        {        
            System.out.println("Enter the first name");
            name1 = ob.next();
            System.out.println("Enter the Surname");
            name2 = ob.next();
            System.out.println("Enter the marks in Physics :");
            ph = ob.next();
            System.out.println("Enter the marks in Chemistry :");
            ch = ob.next();
            System.out.println("Enter the marks in Biology :");
            bio = ob.next();
            pr.println(name1);
            pr.println(name2);
            pr.println(ph);
            pr.println(ch);
            pr.println(bio);
        }
        ob.close();
        br.close();
        fr.close();
    }
}
