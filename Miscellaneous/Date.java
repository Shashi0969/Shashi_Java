import java.io.*;
class Date
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(read);
        long d,b,da,m,y;
        String y2="";
        System.out.println("Enter the number of Days");
        d = Long.parseLong(br.readLine());
        b = d%365;
        da = b%30;
        m = b/30;
        y = d/365;
        y2 = String.valueOf(y);
        y2 = (y>9)? y2:"0"+y2;
        System.out.println("Date =" +da);
        System.out.println("Month =" +m);
        System.out.println("Year =" +y);
        System.out.println("Full Date =" +da+"\\"+m+"\\"+"20"+y2);
    }
}
