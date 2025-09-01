import java.io.*;
class Admission
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader read =  new  InputStreamReader(System.in);
        BufferedReader br =  new  BufferedReader(read);
        File intFile =  new  File("PLUSTWO.DAT");
        FileOutputStream fout =  new  FileOutputStream(intFile);
        DataOutputStream ffout =  new  DataOutputStream(fout);
        String name;
        String Class;
        String dob;
        String stream;
        int i;
        i = 1;
        while (i<=10) 
        {
            System.out.print("Name:");
            name = br.readLine();
            System.out.print("\nClass:");
            Class = br.readLine();
            System.out.print("\nDOB:");
            dob = br.readLine();
            System.out.print("\nStream:");
            stream = br.readLine();
            ffout.writeUTF(name);
            ffout.writeUTF(Class);
            ffout.writeUTF(dob);
            ffout.writeUTF(stream);
            i = i + 1;
        }
        fout.close();
    }
}
