import java.util.*;
import java.io.*;
class English
{
    static void Eng1() throws IOException
    {
        Scanner sc = new Scanner(System.in);
        File ob = new File("ENG1.dat");
        FileOutputStream fout = new FileOutputStream(ob);
        DataOutputStream ffout = new DataOutputStream(fout);
        String E,name1,name2;
        int i;
        for(i=1;i<=5;i++)
        {
            System.out.println("Enter the first name");
            name1 = sc.next();
            System.out.println("Enter the surname");
            name2 = sc.next();
            E = sc.next();
            ffout.writeUTF(name1);
            ffout.writeUTF(name2);
            ffout.writeUTF(E);
        }
        ffout.close();
        fout.close();
        sc.close();
    }
    static void Eng2() throws IOException
    {
        Scanner sc = new Scanner(System.in);
        File ob = new File("ENG2.dat");
        FileOutputStream fout = new FileOutputStream(ob);
        DataOutputStream ffout = new DataOutputStream(fout);
        String E,name1,name2;
        int i;
        for(i=1;i<=5;i++)
        {
            System.out.println("Enter the first name");
            name1 = sc.next();
            System.out.println("Enter the surname");
            name2 = sc.next();
            E = sc.next();
            ffout.writeUTF(name1);
            ffout.writeUTF(name2);
            ffout.writeUTF(E);
        }
        ffout.close();
        fout.close();
        sc.close();
    }
    public static void main(String args[]) throws IOException
    {
        FileInputStream fin1 = new FileInputStream("ENG1.dat");
        FileInputStream fin2 = new FileInputStream("ENG2.dat");
        DataInputStream ffin1 = new DataInputStream(fin1);
        DataInputStream ffin2 = new DataInputStream(fin2);
        File ob = new File("ENG.dat");
        FileOutputStream fout = new FileOutputStream(ob);
        DataOutputStream ffout = new DataOutputStream(fout);
        String name1,name2,E,E1,E2;
        boolean EOF = false;
        while(!EOF)
        {
            try
            {
                name1 = ffin1.readUTF();
                name1 = ffin2.readUTF();
                name2 = ffin1.readUTF();
                name2 = ffin2.readUTF();
                E1 = ffin1.readUTF();
                E2 = ffin2.readUTF();
                E = Integer.toString((Integer.parseInt(E1)+Integer.parseInt(E2))/2);
                ffout.writeUTF(name1);
                ffout.writeUTF(name2);
                ffout.writeUTF(E);
            }
            catch(EOFException e)
            {
                System.out.println("End of file encountered");
                EOF = true;
            }
        }
        ffin2.close();
        ffin1.close();
        fin2.close();
        fin1.close();
        ffout.close();
        fout.close();
    }
}

