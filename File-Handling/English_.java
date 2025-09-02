import java.util.*;
import java.io.*;
class English_
{
    public static void main(String args[]) throws IOException
    {
        FileInputStream fin = new FileInputStream("ENG.dat");
        DataInputStream ffin = new DataInputStream(fin);
        boolean EOF = false;
        while(!EOF)
        {
            try
            {
                System.out.println(ffin.readUTF());
                System.out.println(ffin.readUTF());
                System.out.println(ffin.readUTF());
                System.out.println(ffin.readUTF());
            }
            catch(EOFException e)
            {
                System.out.println("End of file encountered");
                EOF = true;
            }
        }
    }
}
