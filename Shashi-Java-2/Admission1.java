import java.io.*;
class Admission1
{
    public static void main(String arg[]) throws IOException
    {
        FileInputStream fin = new FileInputStream("PLUSTWO.DAT");
        DataInputStream ffin = new DataInputStream(fin);
        String p;
        while((p=ffin.readLine())!=null)
        {
            System.out.println(p);
        }
        ffin.close();
        fin.close();
    }
}